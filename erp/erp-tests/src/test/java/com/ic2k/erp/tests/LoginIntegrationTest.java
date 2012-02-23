package com.ic2k.erp.tests;


import org.jboss.seam.core.Manager;
import org.jboss.seam.mock.SeamTest;
import org.jboss.seam.web.Session;
import org.testng.annotations.Test;

public class LoginIntegrationTest extends SeamTest
{
   @Test
   public void testLoginComponent() throws Exception
   {
      new ComponentTest() {

         @Override
         protected void testComponents() throws Exception
         {
            assert getValue("#{identity.loggedIn}").equals(false);
            setValue("#{identity.username}", "admin");
            setValue("#{identity.password}", "");
            invokeMethod("#{identity.login}");
            assert getValue("#{identity.loggedIn}").equals(true);
         }
      }.run();
   }
   
   @Test
   public void testLogin() throws Exception
   {
      
      new FacesRequest() {
         
         @Override
         protected void invokeApplication()
         {
            assert !isSessionInvalid();
            assert getValue("#{identity.loggedIn}").equals(false);
         }
         
      }.run();
      
      new FacesRequest() {

         @Override
         protected void updateModelValues() throws Exception
         {
            assert !isSessionInvalid();
            setValue("#{identity.username}", "admin");
         }

         @Override
         protected void invokeApplication()
         {
            invokeAction("#{identity.login}");
         }

         @Override
         protected void renderResponse()
         {        	 
            assert !Manager.instance().isLongRunningConversation();
            assert getValue("#{identity.hasRole('admin')}").equals(true);
         }
         
      }.run();
      
      new FacesRequest() {

         @Override
         protected void invokeApplication()
         {
            assert !isSessionInvalid();
            assert getValue("#{identity.loggedIn}").equals(true);
         }
         
      }.run();
      
      new FacesRequest() {

         @Override
         protected void invokeApplication()
         {
            assert !Manager.instance().isLongRunningConversation();
            assert !isSessionInvalid();
            invokeMethod("#{identity.logout}");
            assert Session.instance().isInvalid();
         }

         @Override
         protected void renderResponse()
         {
            assert getValue("#{identity.loggedIn}").equals(false);
            assert Session.instance().isInvalid();
         }
         
      }.run();
      
      new FacesRequest() {

          @Override
          protected void updateModelValues() throws Exception
          {
             assert isSessionInvalid();
             setValue("#{identity.username}", "dummy");
          }

          @Override
          protected void invokeApplication()
          {
             invokeAction("#{identity.login}");
          }

          @Override
          protected void renderResponse()
          {        	 
             assert !Manager.instance().isLongRunningConversation();
             assert getValue("#{identity.hasRole('admin')}").equals(false);
          }
          
       }.run();
   }
}
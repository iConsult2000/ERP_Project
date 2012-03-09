package com.iconsult2k.statefull.gestiondestock.beans;

import javax.ejb.Local;

import org.jboss.ejb3.annotation.Management;

@Local  
public interface GestionDeStockLocal extends javax.ejb.EJBLocalHome {
	
	  void create() throws Exception;
	  void start() throws Exception;
	  void stop()throws Exception;
	  void destroy()throws Exception;
	  void checkout();

}

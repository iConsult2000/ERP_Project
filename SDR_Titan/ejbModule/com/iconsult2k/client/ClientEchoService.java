/**
 * 
 */
package com.iconsult2k.client;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.iconsult2k.stateless.echo.beans.EchoServiceRemote;

/**
 * @author sdacalor
 *
 */
public class ClientEchoService {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			EchoServiceRemote beanRemote = (EchoServiceRemote) context.lookup("EchoServiceBean/remote");
			System.out.println(beanRemote.echo(" Can u see me !!!"));
		} catch (NamingException e){
			e.printStackTrace();
		}

	}

}

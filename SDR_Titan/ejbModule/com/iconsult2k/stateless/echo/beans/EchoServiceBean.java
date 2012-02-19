package com.iconsult2k.stateless.echo.beans;

import javax.ejb.Stateless;


/**
 * @author sdacalor
 *
 */
@Stateless
public class EchoServiceBean implements EchoServiceRemote {

	/* (non-Javadoc)
	 * @see com.iconsult2k.interfaces.EchoService#echo(java.lang.String)
	 */
	@Override
	public String echo(String message) {
		// TODO Auto-generated method stub
		return "Votre texte est :" + message;
	}

}

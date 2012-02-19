package com.iconsult2k.stateless.echo.beans;

import javax.ejb.Local;

@Local
public interface EchoServiceLocal extends EchoService, javax.ejb.EJBLocalHome {

}

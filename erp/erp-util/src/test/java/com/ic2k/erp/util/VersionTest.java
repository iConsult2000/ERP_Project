package com.ic2k.erp.util;

import org.jboss.seam.log.Log;
import org.jboss.seam.log.Logging;
import org.testng.annotations.Test;
import static org.testng.Assert.*;


public class VersionTest {

	private static Log LOG = Logging.getLog(VersionTest.class);
	
	@Test
	public void testVersion()
	{
		try {
			LOG.debug("Version from filtered properties #0",Version.VALUE);
			assertFalse("${app.version}".equals(Version.VALUE),"erp-util.properties is not filtered");
		} catch (ExceptionInInitializerError e) {
			LOG.error("erp-util.properties could not be read");
			fail("Filtering is buggy under M2Eclipse, try cleaning the project or doing a 'touch' on erp-util.properties");
		}
	}
}

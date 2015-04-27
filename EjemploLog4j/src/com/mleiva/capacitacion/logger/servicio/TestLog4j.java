package com.mleiva.capacitacion.logger.servicio;

import org.apache.log4j.Logger;

public class TestLog4j {

	private static final Logger LOGGER=Logger.getLogger(TestLog4j.class.getName());
	//private static final Logger LOGGER=Logger.getLogger("com.mleiva.capacitacion.logger.TestLog4j");
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LOGGER.debug("LOG en nivel DEBUG"+12+"Fecha "+new java.util.Date());
		
		LOGGER.info("LOG en nivel INFO");
		LOGGER.error("LOG en nivel ERROR con el log4j");
		

	}

}

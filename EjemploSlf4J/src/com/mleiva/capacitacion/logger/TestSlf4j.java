package com.mleiva.capacitacion.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TestSlf4j {
	private static final Logger LOGGER=LoggerFactory.getLogger(TestSlf4j.class);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LOGGER.debug("Capacitacion en la {}, con Fecha: {}", 
				"Empesa1",new java.util.Date());

	}

}

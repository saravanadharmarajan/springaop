package com.training.spring.aspects;

import java.util.logging.Logger;

public class RegularLogger {

	private static final Logger LOGGER = Logger.getLogger(RegularLogger.class.getName());
	
	
	public void writeLog()
	{
		 LOGGER.info("Writing Log through class "+LOGGER.getName());
	}
}

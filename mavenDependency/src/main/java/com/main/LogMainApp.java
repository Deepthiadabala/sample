package com.main;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class LogMainApp {

	private static final Logger LOGGER = LogManager.getLogger(LogMainApp.class);
	public static void main(String[] args) {
		System.out.println("Good Morning");
		LOGGER.info("info");
		LOGGER.debug("Debug");
		LOGGER.error("error");
		LOGGER.fatal("Fatal");
	}

}

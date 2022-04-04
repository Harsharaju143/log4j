package com.microsoft.log;

import org.apache.log4j.Logger;

public class Clint {
	private static final Logger logger = Logger.getLogger(Clint.class);
	public static void main(String[] args) {
		logger.trace("trace..");
		logger.debug("debug..");
		logger.info("info..");
		logger.warn("warn..");
		logger.error("error..");
		logger.fatal("fatal..");
	}
}

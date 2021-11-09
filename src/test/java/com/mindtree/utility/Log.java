package com.mindtree.utility;

import org.apache.log4j.Logger;

public class Log {
	public static void testLoggerDebug(Logger logger, String msg) {
		logger.debug(msg);
	}

	public static void testLoggerInfo(Logger logger, String msg) {
		logger.info(msg);
	}

	public static void testLoggerWarn(Logger logger, String msg) {
		logger.warn(msg);
	}

	public static void testLoggerError(Logger logger, String msg) {
		logger.error(msg);
	}

	public static void testLoggerFatal(Logger logger, String msg) {
		logger.fatal(msg);
	}
}

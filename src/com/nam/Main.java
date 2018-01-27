package com.nam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Logger logger = LoggerFactory.getLogger(Main.class);

        logger.info("Hello World");

        logger.debug("Wtf");

        logger.warn("Fuck");

        logger.error("42");

        logger.trace("111");

    }
}

package com.nam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Logger logger = LoggerFactory.getLogger(Main.class);

        logger.info("Hello World");

        logger.warn("Fuck");

        logger.error("42");
    }


}

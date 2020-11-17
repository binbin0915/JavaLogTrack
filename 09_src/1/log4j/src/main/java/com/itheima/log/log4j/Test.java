package com.itheima.log.log4j;

import org.apache.log4j.Logger;

public class Test {
    private  static  final Logger logger = Logger.getLogger(Test.class);

    public static void main(String[] args) {
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.fatal("fatal");
    }
}

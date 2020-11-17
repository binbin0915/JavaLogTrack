package com.itheima.log.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Demo {
    private static final Logger logger = LoggerFactory.getLogger(Demo.class);
    public static void main(String[] args) throws InterruptedException {
        String name = "aaa";

        for (int i = 0; i < 100; i++) {
            Thread.sleep(1000);
            logger.debug("debug:name={}",name);
            logger.info("info:name={}",name);
        }
    }
}

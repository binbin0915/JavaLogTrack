package com.itheima.log.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {
    private static  final Logger logger = LogManager.getLogger(Demo.class);
    public static void main(String[] args) {
        logger.info("xxx");
        String name ="aaa";
        logger.info("name={}",name);
    }
}

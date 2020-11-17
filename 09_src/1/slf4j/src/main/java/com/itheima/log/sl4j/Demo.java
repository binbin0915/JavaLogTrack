package com.itheima.log.sl4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Demo {
    private final static Logger log = LoggerFactory.getLogger(Demo.class);
    public static void main(String[] args) {
        String name = "abc";
        log.info("name={}",name);
    }
}

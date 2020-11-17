package com.itheima.log.jul;

import java.util.logging.Logger;

public class Demo {
    static {
        System.setProperty("java.util.logging.config.file",
                Demo.class.getClassLoader().getResource("logging.properties").getPath());
    }
    private static final Logger loggger = Logger.getLogger(Demo.class.getName());
    public static void main(String[] args) {
        loggger.finest("finest");
        loggger.fine("fine");
        loggger.info("info");
        loggger.warning("warning");
    }
}

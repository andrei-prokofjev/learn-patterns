package com.apro.patterns;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Main {

    private final static Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        System.out.println(">>> hello world! ");
        BasicConfigurator.configure();

        LOGGER.error("aaaaaa");



    }
}

package com.apro.patterns.behavioral.chain;

public class ErrorLogger extends AbstractLogger {
    ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}

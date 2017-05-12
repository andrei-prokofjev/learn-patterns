package com.apro.patterns.behavioral.chain;

public class FileLogger extends AbstractLogger {
    FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}

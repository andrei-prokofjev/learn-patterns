package com.apro.patterns.behavioral.chain;

public abstract class AbstractLogger {
    static int INFO = 1;
    static int DEBUG = 2;
    static int ERROR = 3;

    int level;

    //next element in chain or responsibility
    private AbstractLogger nextLogger;

    void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    abstract protected void write(String message);
}

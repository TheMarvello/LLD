package ChainOfResponsiblityDesignPattern.LoggingSystem;

abstract public class LogProcessor {
    LogProcessor nextLogProcessor;
    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;

    LogProcessor(LogProcessor nextLogProcessor){
        this.nextLogProcessor = nextLogProcessor;
    }

    void log(int logLevel, String message) {
        if(nextLogProcessor != null){
            nextLogProcessor.log(logLevel, message);
        }
    }
}

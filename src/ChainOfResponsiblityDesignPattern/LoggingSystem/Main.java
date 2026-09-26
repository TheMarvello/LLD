package ChainOfResponsiblityDesignPattern.LoggingSystem;

public class Main {
    public static void main(String[] args) {
        LogProcessor logger = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logger.log(LogProcessor.INFO, "INFO hai ye");
        logger.log(LogProcessor.DEBUG, "DEBUG hai ye");
        logger.log(LogProcessor.ERROR, "ERROR hai ye");
    }
}

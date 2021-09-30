package logging;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.*;

class EdurekaLogger {
    private final static Logger LOGGER =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public void sampleLog()
    {
        LOGGER.log(Level.WARNING, "Welcome to Edureka!");
    }
}
class Customers {
    public static void main(String[] args)
    {
        EdurekaLogger obj = new EdurekaLogger();
        obj.sampleLog();
        LogManager slg = LogManager.getLogManager();
        Logger log = slg.getLogger(Logger.GLOBAL_LOGGER_NAME);
        log.log(Level.WARNING, "Hi! Welcome from Edureka");
    }
}

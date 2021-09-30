package logging;

import org.apache.log4j.Logger;

public class Customer {
    static Logger logger = Logger.getLogger(Customers.class);
    public static void main(String[] args) {
        logger.error("ERROR");
        logger.warn("WARNING");
        logger.fatal("FATAL");
        logger.debug("DEBUG");
        logger.info("INFO");
        System.out.println("Final Output");
    }
}

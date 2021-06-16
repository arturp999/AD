package SmartTermo;

import java.io.File;
import java.io.IOException;
import java.util.logging.*;


public class MyLogger {
    static private FileHandler fileTxt;
    static private SimpleFormatter formatterTxt;

    static private FileHandler fileHTML;
    static private Formatter formatterHTML;

    static public void setup() throws IOException {
        // get the global logger to configure it
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        logger.setLevel(Level.ALL);
        fileTxt = new FileHandler("Logging.txt");

        // create a TXT formatter
        formatterTxt = new SimpleFormatter();
        fileTxt.setFormatter(formatterTxt);
        logger.addHandler(fileTxt);

    }
}

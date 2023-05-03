package org.phonebook;

import java.io.FileInputStream;
import java.util.logging.*;

public class MyLogger {

    public static Logger logger = Logger.getGlobal();
    static {
        try(FileInputStream ins = new FileInputStream(".\\src\\main\\java\\org\\phonebook\\log.config")){
            LogManager.getLogManager().readConfiguration(ins);
            logger = Logger.getLogger(Main.class.getName());
        }catch (Exception ignore){
            ignore.printStackTrace();
        }
    }
}

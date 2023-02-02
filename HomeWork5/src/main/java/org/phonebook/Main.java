package org.phonebook;


import java.io.IOException;
import java.util.logging.*;

//Создать телефонный справочник с возможностью импорта и экспорта данных в нескольких форматах.
//  под форматами понимаем структуру файлов, например:
//  - в файле на одной строке хранится одна часть записи, пустая строка - разделитель
public class Main {

    public static final Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) throws IOException {

//        Main run = new Main();
//        run.ExportFile(ArrayList<Phonebook> pb);
//        Filemanager run = new Filemanager();
//        Addressbook phones = new Addressbook();
//        phones.Addressbook();
////        run.ExportFile(phones.pb);
////        System.out.println(phones.pb);
//        run.ImportFile(phones.pb);
//        System.out.println("****************");
//        phones.showAddressBook();

        Menu.mainMenu();

        Handler fileHandler = new FileHandler("%h/myLogging.log");
        logger.addHandler(fileHandler);
        logger.log(Level.INFO, "info");


//        logger.log(Level.WARNING, "warning", new Throwable());

//        Handler consoleHandler = new ConsoleHandler();

    }


}
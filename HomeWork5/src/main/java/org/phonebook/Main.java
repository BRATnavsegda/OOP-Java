package org.phonebook;

import java.util.logging.*;
import java.io.IOException;


//Создать телефонный справочник с возможностью импорта и экспорта данных в нескольких форматах.
//  под форматами понимаем структуру файлов, например:
//  - в файле на одной строке хранится одна часть записи, пустая строка - разделитель
public class Main {


    public static void main(String[] args) throws IOException {

        MyLogger.logger.log (Level.INFO, "Start program");

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


        MyLogger.logger.log (Level.INFO, "Stop program");

//        logger.log(Level.WARNING, "warning", new Throwable());

//        Handler consoleHandler = new ConsoleHandler();

    }


}
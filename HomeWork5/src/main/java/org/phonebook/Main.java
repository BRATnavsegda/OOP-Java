package org.phonebook;

import java.util.logging.*;
import java.io.IOException;


//Создать телефонный справочник с возможностью импорта и экспорта данных в нескольких форматах.
//  под форматами понимаем структуру файлов, например:
//  - в файле на одной строке хранится одна часть записи, пустая строка - разделитель
public class Main {


    public static void main(String[] args) throws IOException {

        MyLogger.logger.log (Level.INFO, "Start program");

        Menu.mainMenu();

        MyLogger.logger.log (Level.INFO, "Stop program");

    }
}
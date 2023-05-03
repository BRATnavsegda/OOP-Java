package org.phonebook;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;

public class Menu {
    public static void mainMenu() throws IOException {
        MyLogger.logger.log(Level.INFO, "Запуск меню");
        Scanner in = new Scanner(System.in);
        System.out.println("1 - Отобразить справочник");
        System.out.println("2 - Выгрузить данные");
        System.out.println("3 - Загрузить данные");
        System.out.println(". ".repeat(15)+".");
        System.out.print("Выберите действие: ");
        int input = in.nextInt();

        FilesWork run = new FilesWork();
        Phonebook phones = new Phonebook();
        phones.Addressbook();

        switch (input) {
            case 1:
                phones.showAddressBook();

                break;
            case 2:
                phones.Addressbook();
                run.save(phones.pb);
                System.out.println("Export finish");
                break;
            case 3:
                phones.Addressbook();
                run.load(phones.pb);
                phones.showAddressBook();
                break;
        }
    }

//    public void subMenu(){
//
//    }
}

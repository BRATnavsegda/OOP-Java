package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class  Viewer <T> {

    static Viewer<Persona> showPerson= new Viewer<>();
    static Viewer<Group> showGroup = new Viewer<>();
    static Viewer<String> showText = new Viewer<>();

    static Group noDeptPersona = new Group("нет отдела");
    static Group depAcc = new Group("Бухгалтерия");
    static Group depIT = new Group("IT");

    static Scanner in = new Scanner(System.in);

    public void view (String text, T data) {
        System.out.println(text);
        System.out.println(data);
        System.out.println("\n");
    }
    public static void viewGroupPersons(Group persons){
        System.out.println("Наименование отдела: " + persons.getDeptName() +
                "\nСписок сотрудников: \n");
        int i = 0;
        for (Persona a: persons.getPersonaInDept()) {

            i = i + 1;
            System.out.println("№" + i + " || " + a + "||");


        }
    }

    public static Persona setPersona(Group noDept){


        String FIO;
        String Sex;
        int Age;
        System.out.println("-".repeat(25));
        System.out.println("Введите данные сотрудника:");
        System.out.println("ФИО работника: ");
        FIO = in.nextLine();
        System.out.println("ПОЛ работника: ");
        Sex = in.nextLine();
        System.out.println("Возраст работника: ");
        Age = in.nextInt();
        Persona persona = new Persona(FIO, Sex, Age);
        noDept.addPeople(persona);
        return persona;


    }


    public static void mainMenu() {




        while (true) {
            System.out.println("1 - Отобразить список нераспределенных сотрудников");
            System.out.println("2 - Отобразить сотрудников конкретного отдела");
            System.out.println("3 - Перенести сотрудника в другой отдел");
            System.out.println("4 - Создать нового сотрудника");
            System.out.println(". ".repeat(15) + ".");
            System.out.print("Выберите действие: ");
            int input = in.nextInt();


            switch (input) {
                case 1:
                    Viewer.viewGroupPersons(noDeptPersona);
                    break;
                case 2:
                    showDepartments();
                    break;
                case 3:

                    break;
            }
        }
    }

    private static void showDepartments(){
        showText.view("Выберите отдел:",
                "№1 Сотрудники без отдела:" +
                "№2 Бухгалтерия:" +
                "№3 IT:");
        int input = in.nextInt();
        switch (input){
            case 1:
                Viewer.viewGroupPersons(noDeptPersona);
                break;
            case 2:
                Viewer.viewGroupPersons(depAcc);
                break;
            case 3:
                Viewer.viewGroupPersons(depIT);
                break;
        }
    }

}

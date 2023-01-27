package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class  Viewer {
    public static void viewGroupPersons(Group persons){
        System.out.println("Наименование отдела: " + persons.getDeptName() +
                "\nСписок сотрудников: \n");
        int i = 0;
        for (Persona a: persons.getPersonaInDept()) {

            System.out.println("№" + i + " || " + a + "||");
            i = i + 1;

        }
    }

    public static Persona setPersona(Group noDept){

        Scanner in = new Scanner(System.in);
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

}

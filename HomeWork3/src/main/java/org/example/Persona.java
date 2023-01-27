package org.example;

import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Persona {
    String pFIO;
    String pSex;
    int pAge;

    public Persona(String p_FIO, String p_Sex, int p_Age){
        this.pFIO = p_FIO;
        this.pSex = p_Sex;
        this.pAge = p_Age;
    }

    public String getpFIO() {
        return pFIO;
    }
    public String getpSex() {
        return pSex;
    }
    public int getpAge() {
        return pAge;
    }

    public boolean checkAddGroup(Group group){
        System.out.println("Добавить в группу " + group.deptName + "?");
        Scanner in = new Scanner(System.in);
        System.out.println("0 - НЕТ\n1 - ДА");
        int choice = in.nextInt();
        return choice != 0;
    }

    public void addPersonaToDepartment(Group groupIn, Group groupOut){
        boolean check = this.checkAddGroup(groupIn);
        if (check) {
            groupIn.addPeople(this);
            groupOut.delPeople(this);
        } else {
            System.out.println("Работник отказался!");

        }
        Viewer.viewGroupPersons(groupIn);
        Viewer.viewGroupPersons(groupOut);
    }

    @Override
    public String toString() {
        return "ФИО: " + getpFIO() + "; Пол: " + getpSex() + "; Возраст: " + getpAge();
    }
}

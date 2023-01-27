package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
    Main run = new Main();
    Group noDeptPersona = new Group("noDept");
    Group depAcc = new Group("Accounting");
    Group depIT = new Group("IT");

    Persona mike = new Persona("Mike", "man", 31);

    depAcc.addPeople(mike);

    Viewer.setPersona(noDeptPersona).addPersonaToDepartment(depAcc, noDeptPersona);
    Viewer.setPersona(noDeptPersona).addPersonaToDepartment(depAcc, noDeptPersona);
    }








}
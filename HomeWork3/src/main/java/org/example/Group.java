package org.example;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;

public class Group extends Department {


    public Group(String GroupName){
        setDeptName(GroupName);
    }

    public void addPeople(Persona persona){
        personaInDept.add(persona);
    }

    public void delPeople(Persona persona) {
        personaInDept.remove(persona);
    }

}

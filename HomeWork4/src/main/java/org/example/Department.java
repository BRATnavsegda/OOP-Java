package org.example;

import java.util.ArrayList;

public class Department {
    String deptName;


    ArrayList<Persona> personaInDept = new ArrayList<>();
    // dep0, dep1, dep2

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public ArrayList<Persona> getPersonaInDept() {
        return personaInDept;
    }

    public Persona getPersonaFromDepartment(int i) {
       return getPersonaInDept().get(i);
    }
}

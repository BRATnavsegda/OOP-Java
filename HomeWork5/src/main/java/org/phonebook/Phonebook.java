package org.phonebook;

import java.util.ArrayList;

public class Phonebook {

    public ArrayList<Contact> pb = new ArrayList();
    public void Addressbook(){
        pb.add(new Contact("Иванов Иван Иванович", "1234567890", "Иваново"));
        pb.add(new Contact("Сидоров Сидор Сидорович", "0987654321", "Сидорово"));
    }

    public void showAddressBook(){
        for(Contact i : pb){
            System.out.println(i.getName() + " " + i.getPhone() + " " + i.getCity());
        }
    }
}

package org.phonebook;
import java.util.logging.*;
public class Contact {
    String Name;
    String Phone;
    String City;

    public Contact(String name, String phone, String city){
        this.Name = name;
        this.Phone = phone;
        this.City = city;

        MyLogger.logger.log(Level.INFO, "Создан новый контакт");
    }

    public String getName() {
        return Name;
    }

    public String getPhone() {
        return Phone;
    }
    public String getCity() {
        return City;
    }
    public void setName(String name) {
        Name = name;
    }
    public void setPhone(String phone) {
        Phone = phone;
    }
    public void setCity(String city) {
        City = city;
    }

}

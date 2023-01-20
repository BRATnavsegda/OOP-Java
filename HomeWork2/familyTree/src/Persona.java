import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class Persona extends Human {
    public Library PersLibr;

    public Persona(String Name, String Sex, int Age, String persLibr) {
        SetSex(Sex);
        SetName(Name);
        SetAge(Age);
        this.PersLibr = new Library(persLibr);
    }
    ArrayList<Persona> listName = new ArrayList<>();

    public void AddName(Persona persona) {
        listName.add(persona);
    }

    public ArrayList<Persona> getListName() {
        return listName;
    }

    public void Voice() {
        String name = GetName();
        System.out.println("Меня зовут " + name);
    }

    public void pBook(){

    }
}
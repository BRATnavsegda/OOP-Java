package Animals;

import java.util.Random;

public class Cat extends Animal{

    String cat;
    Random r;

    public Cat (String sex, String name, int age, String breed){
        SetSex(sex);
        SetName(name);
        SetAge(age);
        SetBreed(breed);
        SetCategory("Животное-компаньон");
        this.cat = "Кошка";
        r = new Random();

    }

    public void interaction() {
        int i = r.nextInt(3);
        switch (i){
            case 0: System.out.println("Погладили кошку " + this.GetName()); break;
            case 1: System.out.println("Легонько отпнули в сторону из-под ног кошку " + this.GetName());break;
            case 2: System.out.println("Подозвали кошку " + this.GetName());break;
        }

    }

    @Override
    public String toString() {
        return this.cat + " \nКличка: " + GetName() + " \nПол: " + GetSex() +
        " \nВозраст: " + GetAge() + "\nПорода: " + GetBreed();
    }
}

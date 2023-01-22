package Animals;

import java.util.Random;

public class Dog extends Animal{

    String dog;
    Random r;

    public Dog (String sex, String name, int age, String breed){
        SetSex(sex);
        SetName(name);
        SetAge(age);
        SetBreed(breed);
        SetCategory("Животное-компаньон");
        this.dog = "Собака";
        r = new Random();


    }


    public void interaction() {

        int i = r.nextInt(3);
        switch (i){
            case 0: System.out.println("Погладили собаку " + this.GetName());break;
            case 1: System.out.println("Отогнали собаку " + this.GetName());break;
            case 2: System.out.println("Покормили собаку " + this.GetName());break;
        }

    }
    @Override
    public String toString() {
        return this.dog + " \nКличка: " + GetName() + " \nПол: " + GetSex() +
                " \nВозраст: " + GetAge() + "\nПорода: " + GetBreed();
    }
}


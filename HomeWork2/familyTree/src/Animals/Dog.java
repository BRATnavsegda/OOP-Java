package Animals;

import java.util.Random;

public class Dog extends Animal{

    String dog;
    Random r;

    Dog (String sex, String name, int age, String breed){
        SetSex(sex);
        SetName(name);
        SetAge(age);
        SetBreed(breed);
        SetCategory("Животное-компаньон");
        this.dog = "Собака";
        r = new Random();


    }


    public void interaction() {

        int i = r.nextInt(5);
        System.out.println("Погладили собаку");
    }
}


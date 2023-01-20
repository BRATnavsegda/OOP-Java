package Animals;

import java.util.Random;

public class Cow extends Animal{

    String cow;
    Random r;

    public Cow(String sex, String name, int age, String breed){
        SetSex(sex);
        SetName(name);
        SetAge(age);
        SetBreed(breed);
        SetCategory("Крупное домашнее молочное животное");
        this.cow = "Корова";
        r = new Random();

    }

    public void interaction() {
        int i = r.nextInt(3);
        switch (i){
            case 0: System.out.println("Подоили корову " + this.GetName());
            case 1: System.out.println("Покормили корову " + this.GetName());
            case 2: System.out.println("Убрали навоз за коровой " + this.GetName());
        }

    }
}

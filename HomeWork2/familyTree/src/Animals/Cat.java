package Animals;

public class Cat extends Animal{

    String cat;

    Cat (String sex, String name, int age, String breed){
        SetSex(sex);
        SetName(name);
        SetAge(age);
        SetBreed(breed);
        SetCategory("Животное-компаньон");
        this.cat = "Кошка";


    }

    public void interaction() {

        System.out.println("Погладили кошку");
    }
}

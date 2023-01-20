package Animals;

import java.util.Random;

public abstract class Animal {
    private String sex;
    private String name;
    private int age;

    private String breed;

    private String category;


    public void SetSex (String Sex){
        this.sex = Sex;
    }
    public void SetName (String Name){
        this.name = Name;
    }
    public void SetAge(int Age){
        this.age = Age;
    }

    public void SetBreed (String breed){
        this.breed = breed;
    }

    public void SetCategory(String Category){
        this.category = Category;
    }

    public String GetSex (){
        return sex;
    }
    public String GetName (){
        return name;
    }
    public int GetAge(){
        return age;
    }

    public String GetBreed (){
        return breed;
    }

    public String GetCategory (){
        return category;
    }

    public abstract void interaction();
}



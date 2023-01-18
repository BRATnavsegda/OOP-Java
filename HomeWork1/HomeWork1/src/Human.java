import java.util.ArrayList;

import java.util.Collections;
import java.util.Random;

public class Human {
    protected static String name;
    protected static int sex;

    protected static Random r;

    protected static int loveIs;


    static {

        Human.r = new Random();

    }

    Human(String name, int sex ) {
        Human.name = name;
        Human.sex = sex;
        Human.loveIs = r.nextInt(10);

    }
    Human (String name) {
        this (name, 1);
    }

    Human (){
        this("name", 1);
    }

    ArrayList<Human> humans = new ArrayList<>();

    public ArrayList<Human> GetHumList(){
        return humans;
    }

    public void AddName(Human human){
        humans.add(human) ;
    }
    public String GetName(){
        return name;
    }
    public int GetSex(Human human){
        return sex;
    }


}
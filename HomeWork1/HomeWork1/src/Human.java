import java.util.ArrayList;

import java.util.Collections;
import java.util.Random;

public class Human {
    String name;
    int sex;

     Random r;

    int attractiveness;

    String status;

    String relations;



    {

        this.r = new Random();
        this.attractiveness = r.nextInt(3);
        this.status = "нет";
        this.relations = "нет";
    }

    public Human(String name, int sex) {
        this.name = name;
        this.sex = sex;


    }

    public Human(String name) {
        this(name, 1);
    }

    public Human() {
        this("name", 1);
    }

    ArrayList<Human> humans = new ArrayList<>();

    public ArrayList<Human> GetHumList() {
        return humans;
    }

    public void AddHum(Human human) {
        humans.add(human);
    }

    public String GetName() {
        return name;
    }
    public void AddName(String name) {this.name = name;};

    public int GetSex() {return sex;}
    public void AddSex(int sex) {this.sex = sex;};

    public int GetAttractiveness() {return attractiveness;}
    public void AddAttractiveness(int att) {this.attractiveness = att;};

    public String GetStatus() {return status;}
    public void AddStatus(String st) {this.status = st;};

    public String GetRelations(String rel) {return relations;};
    public void AddRelations(String rel) {this.relations = rel;};

    @Override
    public String toString() {
        return String.format("Имя: %s, Привлекательность: %d, Статус: %s, В отношениях c: %s ",
                name, attractiveness, status, relations);
    }

}


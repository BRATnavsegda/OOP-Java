import java.util.ArrayList;

import java.util.Random;

public class Human {
    protected static String name;
    protected static String sex;

    protected static Random r;

    protected static String loveIs;


    static {

    }

  Human(String name, String sex ) {
      this.name = name;
      this.sex = sex;
      Human.r = new Random();

  }
  Human (String name) {
      this (name, "sex");
  }

  Human (){
      this("name", "sex");
  }

  ArrayList<String> names = new ArrayList<>();
  ArrayList<Human> humans = new ArrayList<>();

  public ArrayList<Human> GetHumList(){
      return humans;
  }

  public void AddName(Human human){
      humans.add(human) ;
  }
  public String GetName(){
      return this.name;
  }
  public String GetSex(Human human){
        return human.sex;
  }


}

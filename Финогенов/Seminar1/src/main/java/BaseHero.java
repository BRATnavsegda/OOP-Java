import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public abstract class BaseHero implements BaseInterface{
    String name, role;
    int[] damage;
    int attack, defence, health, maxHealth, speed;

    public BaseHero (String name, String role, int attack, int defence, int[] damage, int health, int speed) {
        this.name = name;
        this.role = role;
        this.attack = attack;
        this.defence = defence;
        this.damage = damage;
        this.maxHealth = health;
        this.health = maxHealth - new Random().nextInt(0, maxHealth);
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                " Attack: " + attack +
                " Defence: " + defence +
                " Damage: " + Arrays.toString(damage) +
                " Health: " + health +
                " Speed: " + speed;
    }

    @Override
    public void step(ArrayList<BaseHero> heroList) {

    }

    @Override
    public String getInfo() {
        return role + " " + String.valueOf(maxHealth) + " " + String.valueOf(health);
    }
}

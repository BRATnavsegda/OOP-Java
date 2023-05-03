import java.util.ArrayList;

public abstract class Healers extends BaseHero{
    int mana;
    public Healers(String name, String role, int attack, int defence, int[] damage, int health, int speed, int mana) {
        super(name, role, attack, defence, damage, health, speed);
        this.mana = mana;

    }


    @Override
    public void step(ArrayList<BaseHero> heroList) {
        int indexHero = -1;
        double result = 0;
        double temp = 0;
        for (int i = 0; i < heroList.size(); i++) {
            if (heroList.get(i).maxHealth != heroList.get(i).health ) {
                double r = heroList.get(i).maxHealth;
                result = 100 - ( heroList.get(i).health * 100 / r);
                if (result > temp) {
                    temp = result;
                    indexHero = i;
                }
            }

        }
        System.out.println("________________________________\n" + heroList.get(indexHero).getInfo());
    }

    @Override
    public String toString() {
        return super.toString() + " Mana: " + mana;
    }


}


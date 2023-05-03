import java.util.ArrayList;
import java.util.Random;

public class Main {

    private static void generateHeroes(ArrayList<BaseHero> heroesList, int quantity, int group) {
        Random rand = new Random();
        for (int i = 0; i < quantity; i++) {
            int type = rand.nextInt(4);
            if (group == 1) {
                switch (type) {
                    case 0 -> heroesList.add(new Farmer(Names.randomName()));
                    case 1 -> heroesList.add(new Mage(Names.randomName()));
                    case 2 -> heroesList.add(new Rogue(Names.randomName()));
                    case 3 -> heroesList.add(new Sniper(Names.randomName()));

                }
            }
            else  {
                switch (type) {
                    case 0 -> heroesList.add(new CrossbowMan(Names.randomName()));
                    case 1 -> heroesList.add(new Monk(Names.randomName()));
                    case 2 -> heroesList.add(new Farmer(Names.randomName()));
                    case 3 -> heroesList.add(new Spearman(Names.randomName()));
                }
            }
        }
    }
    public static void main(String[] args) {

        ArrayList<BaseHero> heroesOne = new ArrayList<>();
        ArrayList<BaseHero> heroesTwo = new ArrayList<>();
        generateHeroes(heroesOne, 10, 1);
        generateHeroes(heroesTwo, 10, 2);
        heroesOne.forEach(n -> System.out.print(n.getInfo() + ", "));
        heroesOne.forEach(n -> n.step(heroesOne));



//        farmer.add(new Farmer("Mihail"));

//        for (String name: farmerNames) {
//            farmer.add(new Farmer(name));
//        }
//        for (int i = 0; i < 5; i++) {
//            farmer.add(new Farmer(Names.randomName()));
//        }
//
//        for (BaseHero farmer1: farmer) {
//            System.out.println(farmer1);;
//        }

    }
}
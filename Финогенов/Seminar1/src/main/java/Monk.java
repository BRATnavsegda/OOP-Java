public class Monk extends Healers{
    int mana;


    public Monk(String name) {
        super(name, "Monk", 12, 7, new int[]{-4, -4}, 30, 5, 1);
        this.mana = 1;
    }

}

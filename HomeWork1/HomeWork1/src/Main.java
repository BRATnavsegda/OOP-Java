public class Main {
    public static void main(String[] args) {
        Human batya = new Human("Ivan", 1);
        Human son = new Human("Misha", 1);
        Human mother = new Human("Ira", 0);
        Human ded = new Human("Ivanovich", 1);
        Human baba = new Human("Marusya", 0);
        Human she = new Human("Vasilisa", 0);
        ded.AddName(batya);
        batya.AddName(son);
        batya.AddName(she);
        mother.AddName(son);
        mother.AddName(she);
        baba.AddName(mother);

        Actions.view(ded, 0);
        Actions.view(baba, 0);
    }
}
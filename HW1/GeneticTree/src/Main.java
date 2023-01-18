public class Main {
    public static void main(String[] args) {

        Human batya = new Human("Ivan", "father");
        Human son = new Human("Misha", "son");
        Human mother = new Human("Ira", "wife");
        Human ded = new Human("Ivanovich", "grandfather");
        Human baba = new Human("Marusya", "grandmother");
        Human she = new Human("Vasilisa", "daughter");
        ded.AddName(batya);
        batya.AddName(son);
        batya.AddName(she);
        mother.AddName(son);
        mother.AddName(she);
        baba.AddName(mother);

        TreeView.view(ded, 0);
        TreeView.view(baba, 0);
    }
}
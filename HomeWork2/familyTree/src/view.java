import Animals.Animal;

public class view {
    public static void treeView(Persona root, int num){
        String line = "_".repeat(num);
//        System.out.println(line + root.FullName);
        System.out.println(line + root.GetName());
        for (Persona a: root.getListName()) {
            treeView(a, num + 1);
        }
    }
    public static void bookView(Persona root){
        System.out.println("имя библиотеки " + root.PersLibr.LibraryName);
        for (LibraryBooks a: root.PersLibr.listBook) {
            System.out.println(a.bAutor + " " + a.bName);
        }
    }

    public static void animalsView(Persona root) {
        System.out.println("Домашние животные принадлежащие " + root.GetName());
        for (Animal a : root.animals) {
            System.out.println(a + "\n_____________________________");
        }
    }
    }

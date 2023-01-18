public class TreeView {
    public static void view(Human root, int num){
        String line = "'-".repeat(num);
        System.out.println(line + root.GetName());
        for (Human hum: root.GetHumList()) {
            view(hum, num+1);
        }
    }
}

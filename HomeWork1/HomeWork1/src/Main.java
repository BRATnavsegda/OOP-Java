import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Boy ivan = new Boy("Иван");
        Girl ira = new Girl("Ира");
        Boy ivanovich = new Boy("Иванович");
        Girl marusya = new Girl("Маруся");
        Girl vasilisa = new Girl("Василиса");
        System.out.println(ivan);
        System.out.println(ira);
        Actions.IsFirstDate(ivan, ira);
        System.out.println(ivan);
        System.out.println(ira);
        Actions.IsFirstDate(ivan, marusya);
        System.out.println(marusya);
        
    }
}
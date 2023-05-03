import java.util.Random;

public enum Names {
    Алексей, Кирилл, Георгий, Василий, Иван, Задира, Борис, Андрей, Иннокентий, Роман,
    Владислав, Александр, Алик, Павел, Николай;

    public static String randomName() {
        int i = new Random().nextInt(Names.values().length);
        return String.valueOf(Names.values()[i]);
    }
}

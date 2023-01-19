public class Actions {
    public static void IsFirstDate(Boy boy, Girl girl) {
        System.out.println(boy.GetName()+" и " + girl.GetName() + " отправим их на свидание");

        String temp = "нет";
        if (temp.equals(boy.GetStatus()) && temp.equals(girl.GetStatus())) {

            if (boy.GetAttractiveness() == girl.GetAttractiveness()) {
                boy.AddStatus("в отношениях");
                boy.AddRelations(girl.GetName());
                boy.AddHum(girl);
                girl.AddStatus("в отношениях");
                girl.AddRelations(boy.GetName());
                girl.AddHum(boy);
                System.out.println(boy.GetName() + " и " + girl.GetName() + " теперь в отношениях");
            } else if (boy.GetAttractiveness() > girl.GetAttractiveness()) {
                System.out.println(boy.GetName() + " считает, что достоин лучшей, чем " + girl.GetName());
            } else {
                System.out.println("Он ей не понравился, давай следующего...");
            }
        }
        else {
            System.out.println("Уже в отношениях, дома дети кричат, кушать просят, какое им свидание?!");
        }
    }

}

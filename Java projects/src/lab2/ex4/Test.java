package lab2.ex4;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        User pole = new User("pl", new PolishLanguage());
        User briton = new User("en", new EnglishLanguage());
        ArrayList<User> users = new ArrayList<User>();
        ArrayList<Ad> ads = new ArrayList<Ad>();
        users.add(pole);
        users.add(briton);

        Ad ad1 = new Ad(100, "Lorem ipsum");
        Ad ad2 = new Ad(200, "Dummy text");
        Ad ad3 = new Ad(300, "Lorem");

        ads.add(ad1);
        ads.add(ad2);
        ads.add(ad3);

        users.forEach((u)->{
            ads.forEach((a)->{
                u.translate(a.getContent());
            });
        });


    }
}

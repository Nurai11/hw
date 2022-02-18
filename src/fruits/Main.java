package fruits;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Apple, String> apples = new HashMap<>();
        Map<Pear, String> pears = new HashMap<>();
        Map<Apricot, String> apricots = new HashMap<>();

        List<String> list = new ArrayList<>();

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();

        Apricot apricot1 = new Apricot();
        Apricot apricot2 = new Apricot();

        apples.put(apple1, "a1");
        apples.put(apple2, "a2");
        System.out.println(apples);
        apples.clear();
        System.out.println(apples);

        apricots.put(apricot1, "delicious");
        apricots.put(apricot2, "wormy");


        for (int i = 0; i < apricots.size(); i++) {
            if (apricots.containsValue("wormy")) {
                list.add(String.valueOf(apricots));
                System.out.println("Не понимаю в чем дело^^");
            }
        }

        System.out.println(apricots);
        System.out.println(list);
    }
}

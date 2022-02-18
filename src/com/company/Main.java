package com.company;


import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Car> carMap = new HashMap<>();
        carMap.put("1234", new Car("BMV"));
        carMap.put("2345", new Car("Lexus"));
        carMap.put("3456", new Car("Subaru"));

        System.out.println(carMap);


        // Ответы на вопросы
        System.out.println("Ну, ключ - это слово, а значение - это описание слова");
        System.out.println("Ключи уникальны, потому что так легче искать элемент");
        System.out.println("Значения могут быть одинаковыми, так как доступ к значениям идет по ключу(а ключи уникальны)");
        System.out.println("Хранит пары ключ-значение, где ключ должен быть уникальным, а значение нет.");
        System.out.println("C помощью цикла и ... entrySet()?");
        System.out.println("Значение по ключу - .keySet() ");


    }
}

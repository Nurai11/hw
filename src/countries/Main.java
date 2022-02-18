package countries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();

        countries.put("USA", "United States of America");
        countries.put("KG", "Kyrgyzstan");
        countries.put("RU", "Russia");
        System.out.println(countries);

        countries.putIfAbsent("UK", "United Kingdom");

        System.out.println(countries.get("UK"));
        System.out.println(countries.getOrDefault("CH", "The country not found"));

        List<String> codeName = new ArrayList<>();
        for (String key : countries.keySet()) {
            String newCodeName = key + " = " + countries.get(key);
            codeName.add(newCodeName);
        }

        System.out.println(codeName);


        countries.remove("KG");
        System.out.println(countries);

        Map<String, String> newCountries = new HashMap<>();
        newCountries.put("AU", "Australia");
        newCountries.put("DE", "Germany");
        countries.putAll(newCountries);
        System.out.println(countries);
    }
}

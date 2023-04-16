package homework22;

import java.util.HashMap;
import java.util.Map;

public class HomeWork22 {
    public static void main(String[] args) {
        Map<String, Translation> dictionary = new HashMap<>();
        dictionary.put("привіт", new Translation("hello", "こんにちは", "hallo"));
        dictionary.put("сонце", new Translation("sun", "太陽", "Sonne"));
        dictionary.put("вода", new Translation("water", "水", "Wasser"));
        dictionary.put("хліб", new Translation("bread", "パン", "Brot"));
        dictionary.put("яблуко", new Translation("apple", "りんご", "Apfel"));
        dictionary.put("кошеня", new Translation("kitten", "子猫", "Kätzchen"));
        dictionary.put("автомобіль", new Translation("car", "車", "Auto"));
        dictionary.put("мама", new Translation("mom", "お母さん", "Mutter"));
        dictionary.put("батько", new Translation("dad", "お父さん", "Vater"));
        dictionary.put("квіти", new Translation("flowers", "花", "Blumen"));

        String word = "привіт";

        Translation translation = dictionary.get(word);

        if (translation != null) {
            System.out.println("Translation of '" + word + "':");
            System.out.println("English: " + translation.getEnglish());
            System.out.println("Japanese: " + translation.getJapanese());
            System.out.println("German: " + translation.getGerman());
        } else {
            System.out.println("Word not found in the dictionary.");
        }
    }
}

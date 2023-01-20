package homework4;

public class HomeWork4 {

    public static void main(String[] args) {
        String words = "Robot Dreams";

        String wordToUpperCase = words.toUpperCase();
        String wordToLowerCase = words.toLowerCase();

        char firstCharOfWord = words.charAt(0);
        char lastCharOfWord = words.charAt(words.length()-1);

        System.out.println("Words to upper case: " + wordToUpperCase);
        System.out.println("Words to lower case: " + wordToLowerCase);
        System.out.println("First char of words: " + firstCharOfWord);
        System.out.println("Last char of words: " + lastCharOfWord);
    }
}

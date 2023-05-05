package homework27;

public class HomeWork27 {
    public static void main(String[] args) {

        FileHandler.saveToFile("Текст для збереження", "файл.txt");

        String content = FileHandler.readFromFile("файл.txt");
        if (content != null) {
            System.out.println("Зміст файлу: " + content);
        }

    }
}

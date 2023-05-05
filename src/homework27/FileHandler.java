package homework27;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileHandler {

    public static void saveToFile(String text, String fileName) {
        try {
            // Створюємо об'єкт типу File для заданого імені файлу
            File file = new File(fileName);

            // Якщо файл не існує, то створюємо його
            if (!file.exists()) {
                file.createNewFile();
            }

            // Записуємо текст у файл
            FileWriter writer = new FileWriter(file);
            writer.write(text);
            writer.close();

            System.out.println("Текст був успішно записаний у файл " + fileName);
        } catch (IOException e) {
            System.out.println("Сталася помилка при записі у файл " + fileName + ": " + e.getMessage());
        }
    }

    public static String readFromFile(String fileName) {
        try {
            // Створюємо об'єкт типу Path для заданого імені файлу
            Path path = Paths.get(fileName);

            // Зчитуємо вміст файлу в строку
            String content = Files.readString(path);

            System.out.println("Текст був успішно зчитаний з файлу " + fileName);
            return content;
        } catch (IOException e) {
            System.out.println("Сталася помилка при зчитуванні з файлу " + fileName + ": " + e.getMessage());
            return null;
        }
    }
}
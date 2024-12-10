import java.util.*;

public class MyWordsClass_2 {

    public static void main(String[] args) {
        // Исходный список слов
        List<String> words = new ArrayList<>(List.of("яблоко", "груша", "банан", "яблоко", "апельсин", "груша"));

        // Вызов метода для печати уникальных слов
        printUniqueWords(words);
    }

    // Метод для печати уникальных слов в алфавитном порядке
    public static void printUniqueWords(List<String> words) {
        Set<String> uniqueWords = new TreeSet<>(words); // TreeSet для сортировки и уникальности

        System.out.println("Уникальные слова в алфавитном порядке:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }
}
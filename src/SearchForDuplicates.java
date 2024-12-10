import java.util.*;

public class SearchForDuplicates {
    public static void main(String[] args) {
        // Исходный список слов
        List<String> duplicateWords = new ArrayList<>(List.of("Денис", "Юлия", "Татьяна", "Ирина", "Радгай", "Юлия", "Денис", "Юлия"));

        // Вызов метода для подсчёта дублей
        printDuplicateCounts(duplicateWords);
    }

    // Метод для подсчёта дублей и их вывода
    public static void printDuplicateCounts(List<String> words) {
        // Создаём Map для хранения количества вхождений каждого слова
        Map<String, Integer> wordCounts = new HashMap<>();

        // Подсчёт вхождений слов
        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        // Вывод слов с их количеством дублей
        System.out.println("Количество дублей для каждого уникального слова:");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + (entry.getValue() - 1) + " дублей");
            }
        }
    }
}
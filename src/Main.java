import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello  brave new world!");
        System.out.println("Hi! This is branch of developer_2");
        // теперь делим на части вызов нужных нам методов
        // Обработка чисел
        System.out.println("=== Работа с числами ===");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        MyNumbersClass_1.printOddNumbers(nums); // Вызов метода для вывода нечетных чисел
        System.out.println("***************************************");
        MyNumbersClass_1.printEvenNumbers(nums); // Вызов метода для вывода четных чисел

        System.out.println();

        // Обработка слов
        System.out.println("=== Работа со словами ===");
        List<String> words = new ArrayList<>(List.of("яблоко", "груша", "банан", "яблоко", "апельсин", "груша"));
        MyWordsClass_2.printUniqueWords(words); // Вызов метода для вывода уникальных слов
        System.out.println();

        System.out.println("Работа с дублями");
        //работа с дублями
        List<String> duplicateWords = new ArrayList<>(List.of("Денис", "Юлия", "Татьяна", "Ирина", "Радгай", "Юлия", "Денис", "Юлия"));
        SearchForDuplicates.printDuplicateCounts(duplicateWords);
    }

}

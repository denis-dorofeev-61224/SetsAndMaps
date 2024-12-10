import java.util.ArrayList;
import java.util.List;

public class MyNumbersClass_1 {
    public static void main(String[] args) {
        // Исходный список чисел
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        // Вызов методов
        printOddNumbers(nums); // Печать нечетных чисел
        System.out.println("***************************************");
        printEvenNumbers(nums); // Печать четных чисел
    }

    // Метод для печати нечетных чисел
    public static void printOddNumbers(List<Integer> nums) {
        System.out.println("Нечетные числа:");
        for (int num : nums) {
            if (num % 2 != 0) { // Проверка на нечетность
                System.out.println(num);
            }
        }
    }

    // Метод для печати четных чисел
    public static void printEvenNumbers(List<Integer> nums) {
        System.out.println("Чётные числа:");
        for (int num : nums) {
            if (num % 2 == 0) { // Проверка на четность
                System.out.println(num);
            }
        }
    }
}
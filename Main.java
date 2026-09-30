import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // --- 1. Тест Fibonacci ---
        System.out.println("=== Fibonacci ===");
        System.out.println("fibonacci(3) = " + Fibonacci.calculate(3));
        System.out.println("fibonacci(5) = " + Fibonacci.calculate(5));
        System.out.println("fibonacci(6) = " + Fibonacci.calculate(6));

        // --- 2 и 3. Тест Binary Search ---
        System.out.println("\n=== Binary Search ===");
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        System.out.println("Массив: " + Arrays.toString(arr));

        int[] targets = {23, 2, 50};
        for (int target : targets) {
            System.out.println("\nПоиск элемента " + target + ":");
            System.out.println("  Итеративный индекс: " + BinarySearch.iterative(arr, target));
            System.out.println("  Рекурсивный индекс: " + BinarySearch.recursive(arr, target));
        }
    }
}

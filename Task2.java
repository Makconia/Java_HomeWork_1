import java.util.Scanner;

// Task_2.
// Вводится число n, затем n чисел целых, по одному на каждой строке. Затем вводится число, на которое нужно умножить все введённые выше числа.
// Выведите на экран результат умножения построчно.
// Sample Input:
// 4
// 1
// 2
// 3
// 5
// 2
// Sample Output:

// 2
// 4
// 6
// 10

/**
 * Task2
 */
public class Task2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Задайте количество элементов:");
        int size = scan.nextInt();
        System.out.println("");
        System.out.println("Введите " + size + " числа(ел) через enter:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Введите множитель:");
        int multiplier = scan.nextInt();
        System.out.println("Итоговый результат умножения:");
        multiply(arr, multiplier);
        scan.close();
    }

    public static int[] multiply(int[] array, int a) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= a;
            System.out.println(array[i]); 
        }
        return array;
    }
}
// Task_1.
// Создайте массив, в котором будут храниться кубы чисел от 1 до 1000.
//  Затем вводятся 2 числа из этого диапазона. Используя данные из массива найдите их кубы.

// Sample Input:

// 8
// 11
// Sample Output:

// 512
// 1331

import java.util.Scanner;


public class Task1 {

    public static void main(String[] args) {

    int[] arr = new int[1000];
    for (int i = 1; i <= 1000; i++)
    {
        arr[i-1] = i*i*i;
    }
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите первое число: ");
    int number1 = scanner.nextInt();
    System.out.print("Введите второе число: ");
    int number2 = scanner.nextInt();
    cubeNumber(arr, number1, number2);
    scanner.close();
}

public static void cubeNumber(int[] arr, int number1, int number2) {
    int[] cube = new int[2];
    cube[0] = arr[number1-1];
    cube[1] = arr[number2-1];
    System.out.println("Куб первого числа: "+ cube[0]);
    System.out.println("Куб второго числа: "+ cube[1]);
}
}
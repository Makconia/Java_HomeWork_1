import java.util.Scanner;

// Task_3.
// Реализовать простой калькулятор (+,-,=,*), только с целыми числами.

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int number1 = scan.nextInt();
        System.out.println("Введите второе число:");
        int number2 = scan.nextInt();
        System.out.println("Введите арифметическое действие (+, -, * или /) :");
        String action = scan.next();
        switch (action) {
            case "+":
                System.out.println("Решение:");
                System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
                break;
            case "-":
                System.out.println("Решение:");
                System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
                break;
            case "*":
                System.out.println("Решение:");
                System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
                break;
            case "/":
                System.out.println("Решение:");
                System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
                break;
            default:
                System.out.println("Неверное значение действия");
                break;
        }
        scan.close();

    }
}

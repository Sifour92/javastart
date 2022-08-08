import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        boolean isTrue = true;
        OUTER: while (isTrue) {
            String yesNo = "";
            System.out.println("Введите первое число: ");
            int num1 = scanner.nextInt();
            System.out.println("Введите знак математической операции: ");
            char sign = scanner.next().charAt(0);
            System.out.println("Введите второе число: ");
            int num2 = scanner.nextInt();
            int result = calculator.calculate(num1, sign, num2);
            System.out.println("Ответ :" +  result);
            while (!yesNo.equals("yes")) {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                yesNo = scanner.next();
                if (yesNo.equals("no")) {
                    break OUTER;
                }
            }
        }
    }
}
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        boolean isTrue = true;
        while (isTrue) {
            System.out.println("Введите первое число: ");
            int num1 = scanner.nextInt();
            System.out.println("Введите знак математической операции: ");
            String sign = scanner.next();
            System.out.println("Введите второе число: ");
            int num2 = scanner.nextInt();
            int sum = calculator.calculate(num1, sign, num2);
            System.out.println("Ответ :" + sum);
            boolean isInnerTrue = true;
            while (isInnerTrue) {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                String yesNo = scanner.next();
                if (yesNo.equals("no")) {
                    isInnerTrue = false;
                    isTrue = false;
                } else if (yesNo.equals("yes")) {
                    isInnerTrue = false;
                }
            }
        }
    }
}
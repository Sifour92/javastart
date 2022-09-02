import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String yesNo = "";
        while (!yesNo.equals("no")) {
            yesNo = "";
            System.out.println("Введите первое число: ");
            int num1 = scanner.nextInt();
            System.out.println("Введите знак математической операции: ");
            char sign = scanner.next().charAt(0);
            System.out.println("Введите второе число: ");
            int num2 = scanner.nextInt();
            int result = calculator.calculate(num1, sign, num2);
            System.out.println("Ответ :" + result);
            while ((!yesNo.equals("yes") ^ yesNo.equals("no")) || (yesNo.equals("yes") ^ !yesNo.equals("no"))) {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                yesNo = scanner.next();
            }
        }
    }
}
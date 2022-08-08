public class Calculator {
    public int calculate(int num1, String sing, int num2) {
        int sum = -1;
        switch (sing) {
            case "+":
                sum = num1 + num2;
                break;
            case "-":
                sum = num1 - num2;
                break;
            case "*":
                sum = num1 * num2;
                break;
            case "/":
                sum = num1 / num2;
                break;
            case "%":
                sum = num1 % num2;
                break;
            case "^":
                sum = 1;
                for (int i = 1; i <= num2; i++) {
                    sum *= num1;
                }
                break;
            default:
                System.out.println("Введен неверный знак");
        }
        return sum;
    }
}
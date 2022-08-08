public class Calculator {
    public int calculate(int num1, char sing, int num2) {
        switch (sing) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            case '%':
                return num1 % num2;
            case '^':
                int prod = 1;
                for (int i = 1; i <= num2; i++) {
                    prod *= num1;
                }
                return prod;
            default:
                System.out.println("Введен неверный знак");
        }
        return 0;
    }
}
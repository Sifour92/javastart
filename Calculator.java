public class Calculator {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 2;
        int result = 0;
        char sign = '^';
        if (sign == '+') {
            result = num1 + num2;
        } else if (sign == '-') {
            result = num1 - num2;
        } else if (sign == '*') {
            result = num1 * num2;
        } else if (sign == '/') {
            result = num1 / num2;
        } else if (sign == '%') {
            result = num1 % num2;
        } else if (sign == '^') {
            result = 1;
            for (int i = 1; i <= num2; i++) {
                result = result * num1;
            }
        }
        System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
    }
}
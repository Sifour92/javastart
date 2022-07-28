public class CyclesTheme {
    public static void main(String[] args) {
        System.out.print("1.Подсчет суммы четных и нечетных чисел\n");
        int sumEven = 0;
        int sumOdd = 0;
        int counter = -10;
        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        }
        while (counter <= 21);
        System.out.print("В промежутке [-10, 21] сумма четных чисел = " + sumEven +
                ", а нечетных = " + sumOdd + "\n\n");

        System.out.print("2.Вывод чисел в интервале (min и max)\n");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max;
        int min;
        if (num1 >= num2 && num1 >= num3) {
            max = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            max = num2;
        } else {
            max = num3;
        }
        if (num1 <= num2 && num1 <= num3) {
            min = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            min = num2;
        } else {
            min = num3;
        }
        for (int i = max - 1; min < i; i--) {
            System.out.print(i + " ");
        }

        System.out.print("\n\n3.Вывод реверсивного числа и суммы его цифр\n");
        int srcNum = 1234;
        int copySrcNum = srcNum;
        int digit;
        int sumDigits = 0;
        while (srcNum > 0) {
            digit = srcNum % 10;
            srcNum /= 10;
            sumDigits += digit;
            System.out.print(digit + "");
        }
        System.out.print("\nСумма цифр числа " + copySrcNum + " = " + sumDigits);

        System.out.print("\n\n4.Вывод чисел на консоль в несколько строк\n");
        counter = 0;
        for (int i = 1; i < 30; i += 2) {
            if (i <= 24) {
                System.out.format("%2d ", i);
            } else {
                System.out.format("%2d ", 0);
            }
            counter++;
            if (counter % 5 == 0) {
                System.out.println();
            }
        }

        System.out.print("\n5.Проверка количества единиц на четность\n");
        srcNum = 3141591;
        copySrcNum = srcNum;
        int countOnes = 0;
        while (srcNum > 0) {
            srcNum /= 10;
            countOnes++;
        }
        if (countOnes % 2 == 0) {
            System.out.println("Число " + copySrcNum + " содержит" + countOnes + " " +
                    "(четное) количество единиц");
        } else {
            System.out.println("Число " + copySrcNum + " содержит " + countOnes + " " +
                    "(нечетное) количество единиц");
        }

        System.out.print("\n6.Отображение фигур в консоли\n\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        int count = 0;
        counter = 5;
        while (counter > 0) {
            System.out.print("#");
            count++;
            if (count == counter) {
                System.out.println();
                count = 0;
                counter--;
            }
        }
        System.out.println();
        counter = 1;
        do {
            System.out.print("$");
            if (counter == 1 || counter == 3 || counter == 6 || counter == 8) {
                System.out.println();
            }
            counter++;
        }
        while (counter <= 9);

        System.out.print("\n\n7.Отображение ASCII-символов\n");
        char symbol = ' ';
        for (int i = 0; i < 255; i++) {
            if (i == 0) {
                System.out.printf("%5s %5s", "Dec", "Char");
            }
            if (i < 48 && i % 2 != 0) {
                symbol = (char) i;
                System.out.printf("\n%5d %5c", i, symbol);
            }
            if (i >= 97 && i <= 122 && i % 2 == 0) {
                symbol = (char) i;
                System.out.printf("\n%5d %5c", i, symbol);
            }
        }

        System.out.print("\n\n8.Проверка, является ли число палиндромом\n");
        int reversNum = 0;
        int copyNum;
        srcNum = 1234321;
        copyNum = srcNum;
        while (srcNum > 0) {
            digit = srcNum % 10;
            reversNum = (reversNum * 10) + digit;
            srcNum /= 10;
        }
        if (copyNum == reversNum)
            System.out.println("Число " + copyNum + " является палиндромом");
        else
            System.out.println("Число " + copyNum + " не является палиндромом");

        System.out.print("\n9.Определение, является ли число счастливым\n");
        int sumFirstThreeDigit = 0;
        int sumSecondThreeDigit = 0;
        int firstThreeDigit = 123;
        int copyFirstThreeDigit = firstThreeDigit;
        int secondThreeDigit = 456;
        int copySecondThreeDigit = secondThreeDigit;
        digit = 0;
        while (secondThreeDigit > 0) {
            digit = firstThreeDigit % 10;
            sumFirstThreeDigit += digit;
            digit = secondThreeDigit % 10;
            sumSecondThreeDigit += digit;
            firstThreeDigit /= 10;
            secondThreeDigit /= 10;
        }
        System.out.println("Сумма цифр " + copyFirstThreeDigit + " = " + sumFirstThreeDigit);
        System.out.println("Сумма цифр " + copySecondThreeDigit + " = " + sumSecondThreeDigit);
        if (sumFirstThreeDigit == sumSecondThreeDigit) {
            System.out.println("Число счастливое");
        } else {
            System.out.println("Число не счастливое");
        }

        System.out.print("\n10. Вывод таблицы умножения Пифагора\n\n");
        for (int i = 1; i <= 9; i++) {
            if (i == 1) {
                System.out.print(" ");
            } else {
                System.out.print(i);
            }
            for (int j = 0; j <= 9; j++) {
                if (j == 0) {
                    System.out.print(" ");
                } else if (j == 1) {
                    System.out.print("|");
                } else {
                    System.out.printf("%3d", i * j);
                }
            }
            if (i == 1) {
                System.out.print("\n-------------------------------------------");
            }
            System.out.println();
        }
    }
}
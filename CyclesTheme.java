public class CyclesTheme {
    public static void main(String[] args) {
        System.out.print("1.Подсчет суммы четных и нечетных чисел\n");
        int sumEven = 0;
        int sumOdd = 0;
        int startNum = -10;
        do {
            if (startNum % 2 == 0) {
                sumEven = sumEven + startNum;
            } else {
                sumOdd = sumOdd + startNum;
            }
            startNum++;
        }
        while (startNum <= 21);
        System.out.print("В промежутке [-10, 21] сумма четных чисел = " + sumEven + ", а нечетных = " + sumOdd + "\n\n");

        System.out.print("2.Вывод чисел в интервале (min и max)\n");
        int tenValue = 10;
        int fiveValue = 5;
        int minusOneValue = -1;
        int max;
        int min;
        if (tenValue > fiveValue || tenValue > minusOneValue) {
            max = tenValue;
        } else if (fiveValue > minusOneValue) {
            max = fiveValue;
        } else {
            max = minusOneValue;
        }
        if (tenValue < fiveValue || tenValue < minusOneValue) {
            min = tenValue;
        } else if (fiveValue < minusOneValue) {
            min = fiveValue;
        } else {
            min = minusOneValue;
        }
        for (int i = min, j = max; j > i; --j) {
            if (j != max) {
                System.out.print(j + " ");
            }
        }

        System.out.print("\n\n3.Вывод реверсивного числа и суммы его цифр\n");
        int srcNumber = 1234;
        int digit;
        int sumDigits = 0;
        while (srcNumber > 0) {
            digit = srcNumber % 10;
            srcNumber = srcNumber / 10;
            sumDigits = sumDigits + digit;
            System.out.print(digit + "");
        }
        System.out.print("\nСумма цифр числа 1234 = " + sumDigits);

        System.out.print("\n\n4.Вывод чисел на консоль в несколько строк\n");
        int counter = 0;
        for (int i = 1; i < 30; i = i + 2) {
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
        srcNumber = 3141591;
        int numberOnes = 0;
        while (srcNumber > 0) {
            srcNumber = srcNumber / 10;
            numberOnes++;
        }
        if (numberOnes % 2 == 0) {
            System.out.println("Число 3141592 содержит" + numberOnes + " (четное) количество
                    единиц");
        } else {
            System.out.println("Число 3141592 содержит " + numberOnes + " (нечетное) количество
                    единиц");
        }

        System.out.print("\n6.Отображение фигур в консоли\n");
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

        System.out.print("\n\n7.Отображение ASCII-символов");
        char symbol = ' ';
        for (int i = 0; i <= 255; i++) {
            if (i == 0) {
                System.out.printf("%5s", "Dec");
                System.out.printf("%5s", "Char");
                System.out.println();
            }
            if (i < 48 && i % 2 != 0) {
                symbol = (char) i;
                System.out.format("%5d", i);
                System.out.format("%5c", symbol);
                System.out.println();
            }
            if (i >= 97 && i <= 122 && i % 2 == 0) {
                symbol = (char) i;
                System.out.format("%5d", i);
                System.out.format("%5c", symbol);
                System.out.println();
            }
        }

        System.out.print("\n\n8.Проверка, является ли число палиндромом\n");
        int remainder;
        int reversNum = 0;
        int duplicateNum;
        int srcNum = 1234321;
        duplicateNum = srcNum;
        while (srcNum > 0) {
            remainder = srcNum % 10;
            reversNum = (reversNum * 10) + remainder;
            srcNum = srcNum / 10;
        }
        if (duplicateNum == reversNum)
            System.out.println("Число является палиндромом");
        else
            System.out.println("Число не  является палиндромом");

        System.out.print("\n9.Определение, является ли число счастливым\n");
        srcNum = 123456;
        int firstThird = 0;
        int secondThird = 0;
        int secondThreeDigit = 0;
        int firstThreeDigit = 0;
        int tmp;
        for (int i = 1; i <= 6; i++) {
            tmp = srcNum % 10;
            if (i > 3) {
                firstThird += tmp;
                firstThreeDigit = (firstThreeDigit * 10) + tmp;
            } else {
                secondThird += tmp;
                secondThreeDigit = (secondThreeDigit * 10) + tmp;
            }
            srcNum /= 10;
        }
        System.out.println("Сумма цифр " + firstThreeDigit + " = " + firstThird);
        System.out.println("Сумма цифр " + secondThreeDigit + " = " + secondThird);
        if (firstThird == secondThird) {
            System.out.println("Число счастливое");
        } else {
            System.out.println("Число не счастливое");
        }

        System.out.print("\n10. Вывод таблицы умножения Пифагора\n");
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
                    System.out.printf("%5d", i * j);
                }
            }
            System.out.println();
            System.out.println("-------------------------------------------");
        }
    }
}
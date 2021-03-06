public class VariablesTheme {
    public static void main(String[] args) {
        System.out.print("1.Создание переменных и вывод их значений на консоль\n");
        byte bitDepthOS = 64;
        short bitVersion = 64;
        int ram = 16;
        long processorNumber = 9500;
        float cpuBaseClock = 3.0F;
        double maxTurboBoostFrequency = 4.4F;
        char charR = 'R';
        boolean trueBoolean = true;
        System.out.print(bitDepthOS + " - разрядная операционная система, процессор х" +
                bitVersion + "." + " Оперативная память " + ram + "ГБ. Процессор Intel(" + charR +
                ")Core(TM) i5-" + processorNumber + "F CPU @ " + cpuBaseClock + "GHz" + " " +
                maxTurboBoostFrequency + " GHz");

        System.out.print("\n\n2.Расчет стоимости товара со скидкой");
        float productPriceX = 100F;
        float productPriceY = 200F;
        float totalProductsPrice = productPriceX + productPriceY;
        float discount = totalProductsPrice * 11F / 100F;
        System.out.print("\nСумма скидки= " + discount);
        System.out.print("\nОбщая стоимость товара со скидкой = " + (totalProductsPrice - discount));

        System.out.print("\n\n3.Вывод на консоль слова JAVA\n");
        char charJ = 'J';
        char a = 'a';
        char v = 'v';
        char charV = 'V';
        System.out.print("   " + charJ + "    " + a + "  " + v + "     " + v + "  " + a + "   \n");
        System.out.print("   " + charJ + "   " + a + " " + a + "  " + v + "   " + v + "  " + a +
                " " + a + "  \n");
        System.out.print(charJ + "  " + charJ + "  " + a + a + a + a + a + "  " + charV + " " +
                charV + "  " + a + a + a + a + a + " \n");
        System.out.print(" " + charJ + charJ + "  " + a + "     " + a + "  " + charV + "  " + a +
                "     " + a);

        System.out.print("\n\n4.Отображение min и max значений числовых типов данных ");
        byte byteMax = Byte.MAX_VALUE;
        System.out.print("\nПервоначальное значение максимального значения байта= " + byteMax++ +
                ". Значение после инкремента =" + byteMax-- + ". Значение после декремента =" +
                byteMax + ".");
        short shortMax = Short.MAX_VALUE;
        System.out.print("\nПервоначальное значение максимального значения шорт= " + shortMax++ +
                ". Значение после инкремента =" + shortMax-- + ". Значение после декремента =" +
                shortMax + ".");
        int intMax = Integer.MAX_VALUE;
        System.out.print("\nПервоначальное значение максимального значения инт= " + intMax++ +
                ". Значение после инкремента =" + intMax-- + ". Значение после декремента =" +
                intMax + ".");
        long longMax = Long.MAX_VALUE;
        System.out.print("\nПервоначальное значение максимального значения лонг= " + longMax++ +
                ". Значение после инкремента =" + longMax-- + ". Значение после декремента =" +
                longMax + ".");

        System.out.print("\n\n5.Перестановка значений переменных");
        System.out.print("\nA. C помощью третьей переменной: ");
        double firstNum = 1.1;
        double secondNum = 2.2;
        double tmp = firstNum;
        System.out.print("\nЗначение первой переменной до перестановки = " + firstNum);
        System.out.print("\nЗначение второй переменной до перестановки = " + secondNum);
        firstNum = secondNum;
        secondNum = tmp;
        System.out.print("\nЗначение первой переменной после перестановки = " + firstNum);
        System.out.print("\nЗначение второй переменной после перестановки = " + secondNum);
        System.out.print("\nB. C помощью арифметических операций: ");
        System.out.print("\nЗначение первой переменной до перестановки = " + firstNum);
        System.out.print("Значение второй переменной до перестановки =" + secondNum);
        firstNum -= 1.1;
        secondNum += 1.1;
        System.out.print("\nЗначение первой переменной после перестановки = " + firstNum);
        System.out.print("\nЗначение второй переменной после перестановки = " + secondNum);
        System.out.print("\nC. C помощью побитовой операции ^: ");
        System.out.print("\nЗначение первой переменной до перестановки = " + firstNum);
        System.out.print("\nЗначение второй переменной до перестановки =" + secondNum);
        firstNum = ((byte) firstNum ^ 3) + 0.2;
        secondNum = ((byte) secondNum ^ 3) + 0.1;
        System.out.print("\nЗначение первой переменной после перестановки = " + firstNum);
        System.out.print("\nЗначение второй переменной после перестановки = " + secondNum);

        System.out.print("\n\n6.Вывод символов и их кодов");
        int codeChar1 = 35;
        int codeChar2 = 38;
        int codeChar3 = 64;
        int codeChar4 = 94;
        int codeChar5 = 95;
        System.out.print("\nКод символа " + codeChar1 + " это знак " + (char) codeChar1);
        System.out.print("\nКод символа " + codeChar2 + " это знак " + (char) codeChar2);
        System.out.print("\nКод символа " + codeChar3 + " это знак " + (char) codeChar3);
        System.out.print("\nКод символа " + codeChar4 + " это знак " + (char) codeChar4);
        System.out.print("\nКод символа " + codeChar5 + " это знак " + (char) codeChar5);

        System.out.print("\n\n7.Произведение и сумма цифр числа");
        int srcNum = 345;
        int ones = srcNum % 10;
        int dozens = srcNum / 10 % 10;
        int hundreds = srcNum / 100 % 10;
        int multDigits = ones * dozens * hundreds;
        int sumDigits = ones + dozens + hundreds;
        System.out.print("\nПроизведение цифр числа 345 = " + multDigits);
        System.out.print("\nСумма цифр числа 345 = " + sumDigits);

        System.out.print("\n\n8.Вывод на консоль ASCII-арт Дюка");
        char space = 32;
        char slash = 47;
        char backslash = 92;
        char underscore = 95;
        char opBracket = 40;
        char clBracket = 41;
        System.out.print("\n" + space + space + space + space + slash + backslash + space +
                space + space + space + space);
        System.out.print("\n" + space + space + space + slash + space + space + backslash +
                space + space + space + space + space);
        System.out.print("\n" + space + space + slash + underscore + opBracket + space +
                clBracket + backslash + space + space + space);
        System.out.print("\n" + space + slash + space + space + space + space + space + space +
                backslash + space + space);
        System.out.print("\n" + slash + underscore + underscore + underscore + underscore + slash +
                backslash + underscore + underscore + backslash + space);

        System.out.print("\n\n9.Отображение количества сотен, десятков и единиц числа");
        srcNum = 123;
        ones = srcNum % 10;
        dozens = srcNum / 10 % 10;
        hundreds = srcNum / 100;
        System.out.print("\nЧисло 123 содержит: \n" + hundreds + " сотен\n" + dozens +
                " десятков\n" + ones + " единиц");

        System.out.print("\n\n10.Преобразование секунд");
        int secs = 86399;
        int hour = secs / 3600;
        int min = secs / 60 % 60;
        int sec = secs % 60;
        System.out.printf("\n%02d:%02d:%02d", hour, min, sec);
    }
}
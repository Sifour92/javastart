public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1.Создание переменных и вывод их значений на консоль");
        byte bitDepthOS = 64;
        short bitVersion = 64;
        int ram = 16;
        long processorNumber = 9500;
        float cpuBaseClock = 3.0F;
        double cpuBaseClockDuplicate = 3.0F;
        char charR = 'R';
        boolean trueBoolean = true;
        System.out.println(b + " -разрядная операционная система, процессор х" + sh + ". " +
                " Оперативная память " + i + "ГБ. Процессор Intel(" + ch + ")Core(TM) i5-" + l + "F CPU @ " + f + "GHz" +
                " " + d + "GHz");

        System.out.println("\n2.Расчет стоимости товара со скидкой");
        float productPriceX = 100F;
        float productPriceY = 200F;
        float totalProductsPrice = productPriceX + productPriceY;
        float discount = totalProductsPrice + 11F / 100F;
        System.out.println("Сумма скидки= " + discount);
        System.out.println("Общая стоимость товара со скидкой = " + (totalProductsPrice - discount));

        System.out.println("\n3.Вывод на консоль слова JAVA ");
        char J = 'J';
        char a = 'a';
        char v = 'v';
        char V = 'V';
        System.out.print("   " + J + "    " + a + "  " + v + "     " + v + "  " + a + "   \n");
        System.out.print("   " + J + "   " + a + " " + a + "  " + v + "   " + v + "  " + a + " " + a + "  \n");
        System.out.print(J + "  " + J + "  " + a + a + a + a + a + "  " + V + " " + V + "  " + a + a + a + a + a + " \n");
        System.out.print(" " + J + J + "  " + a + "     " + a + "  " + V + "  " + a + "     " + a + "\n");

        System.out.println("\n4.Отображение min и max значений числовых типов данных ");
        byte byteMax = Byte.MAX_VALUE;
        System.out.println("Первоначальное значение= " + byteMax + ".");
        byte byteMaxInc = ++byteMax;
        System.out.println("Значение после инкремента =" + byteMaxInc + ".");
        byte byteMaxDec = --byteMax;
        System.out.println("Значение после декремента =" + byteMaxDec + ".");
        short shortMax = Short.MAX_VALUE;
        System.out.println("Первоначальное значение= " + shortMax + ".");
        short shortMaxInc = ++shortMax;
        System.out.println("Значение после инкремента =" + shortMaxInc + ".");
        short shortMaxDec = --shortMax;
        System.out.println("Значение после декремента =" + shortMaxDec + ".");
        int intMax = Integer.MAX_VALUE;
        System.out.println("Первоначальное значение= " + intMax + ".");
        int intMaxInc = ++intMax;
        System.out.println("Значение после инкремента =" + intMaxInc + ".");
        int intMaxDec = --intMax;
        System.out.println("Значение после декремента =" + intMaxDec + ".");
        long longMax = Long.MAX_VALUE;
        System.out.println("Первоначальное значение= " + longMax + ".");
        long longMaxInc = ++longMax;
        System.out.println("Значение после инкремента =" + longMaxInc + ".");
        long longMaxDec = --longMax;
        System.out.println("Значение после декремента =" + longMaxDec + ".");

        System.out.print("\n5.Перестановка значений переменных");
        System.out.print("\nA. C помощью третьей переменной: \n");
        double first = 1.1;
        double second = 2.2;
        double third = first;
        System.out.println("Значение первой переменной до перестановки с помощью третьей переменной = " + first);
        System.out.println("Значение второй переменной переменной до перестановки с помощью третьей переменной = " + second);
        first = second;
        second = third;
        System.out.println("Значение первой переменной после перестановки с помощью третьей переменной = " + first);
        System.out.println("Значение второй переменной переменной после перестановки с помощью третьей переменной = " + second);
        System.out.print("\nB. C помощью арифметических операций: \n");
        double first2 = 1.1;
        double second2 = 2.2;
        System.out.println("Значение первой переменной до перестановки с помощью арифметических операций = " + first2);
        System.out.println("Значение второй переменной переменной до перестановки с помощью арифметических операций =" + second2);
        first2 = 1.1 + 1.1;
        second2 = 2.2 - 1.1;
        System.out.println("Значение первой переменной после перестановки с помощью арифметических операций = " + first2);
        System.out.println("Значение второй переменной переменной после перестановки с помощью арифметических операций = " + second2);
        System.out.print("\nC. с помощью побитовой операции ^: \n");
        double first3 = 1.1;
        double second3 = 2.2;
        System.out.println("Значение первой переменной до перестановки с помощью арифметических операций = " + first3);
        System.out.println("Значение второй переменной переменной до перестановки с помощью арифметических операций =" + second3);
        first3 = ((byte) first3 ^ 3) + 0.2;
        second3 = ((byte) second3 ^ 3) + 0.1;
        System.out.println("Значение первой переменной после перестановки с помощью арифметических операций = " + first3);
        System.out.println("Значение второй переменной переменной после перестановки с помощью арифметических операций = " + second3);

        System.out.print("\n6.Вывод символов и их кодов");
        int i1 = 35;
        int i2 = 38;
        int i3 = 64;
        int i4 = 94;
        int i5 = 95;
        char ch1 = (char) i1;
        System.out.print("\nЗначение " + i1 + " это знак " + ch1 + "\n");
        char ch2 = (char) i2;
        System.out.print("Значение " + i2 + " это знак " + ch2 + "\n");
        char ch3 = (char) i3;
        System.out.print("Значение " + i3 + " это знак " + ch3 + "\n");
        char ch4 = (char) i4;
        System.out.print("Значение " + i4 + " это знак " + ch4 + "\n");
        char ch5 = (char) i5;
        System.out.print("Значение " + i5 + " это знак " + ch5 + "\n");

        System.out.print("\n7.Произведение и сумма цифр числа\n");
        int number = 345;
        int lastNumber = number % 10;
        number = number / 10;
        int secondNumber = number % 10;
        number = number / 10;
        int firstNumber = number % 10;
        number = number / 10;
        int multiplication = lastNumber + secondNumber + firstNumber;
        int addition = lastNumber + secondNumber + firstNumber;
        System.out.println("Произведение цифр числа 345= " + multiplication);
        System.out.println("Сумма цифр числа 345= " + addition);

        System.out.print("\n8.Вывод на консоль ASCII-арт Дюка\n");
        char whiteSpace = 32;
        char slash = 47;
        char backSlash = 92;
        char lowerSlash = 95;
        char parenthesesLeft = 40;
        char parenthesesRight = 41;
        System.out.println(whiteSpace + "" + whiteSpace + "" + whiteSpace + "" + whiteSpace + "" + slash + "" + backSlash + "" + whiteSpace + "" + whiteSpace + "" + whiteSpace + "" + whiteSpace + "" + whiteSpace);
        System.out.println(whiteSpace + "" + whiteSpace + "" + whiteSpace + "" + slash + "" + whiteSpace + "" + whiteSpace + "" + backSlash + "" + whiteSpace + "" + whiteSpace + "" + whiteSpace + "" + whiteSpace + "" + whiteSpace);
        System.out.println(whiteSpace + "" + whiteSpace + "" + slash + "" + lowerSlash + "" + parenthesesLeft + "" + whiteSpace + "" + parenthesesRight + "" + backSlash + "" + whiteSpace + "" + whiteSpace + "" + whiteSpace);
        System.out.println(whiteSpace + "" + slash + "" + whiteSpace + "" + whiteSpace + "" + whiteSpace + "" + whiteSpace + "" + whiteSpace + "" + whiteSpace + "" + backSlash + "" + whiteSpace + "" + whiteSpace);
        System.out.println(slash + "" + lowerSlash + "" + lowerSlash + "" + lowerSlash + "" + lowerSlash + "" + slash + "" + backSlash + "" + lowerSlash + "" + lowerSlash + "" + backSlash + "" + whiteSpace);

        System.out.print("\n9.Отображение количества сотен, десятков и единиц числа\n");
        int numbers = 123;
        int num = numbers % 10;
        numbers = numbers / 10;
        int ten = numbers % 10;
        numbers = numbers / 10;
        int hundred = numbers % 10;
        System.out.print("Число 123 содержит: \n" + hundred + "сотен\n" + ten + "десятков\n" + num + "едиинц\n");

        System.out.print("\n10.Преобразование секунд");
        int sec = 86399;
        int minutes = sec / 60;
        int hours = minutes / 60;
        System.out.println("Часы :" + hours + " Минуты :" + minutes + " Секунды :" + sec);

    }
}
public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.print("1.Перевод псевдокода на язык Java.");
        int age = 10;
        if (age > 20) {
            System.out.print("\nМожно купить сигареты");
        } else {
            System.out.print("\nНельзя купить сигареты");
        }
        boolean sexMale = false;
        if (!sexMale) {
            System.out.print("\nЭто не мужчина");
        }
        double height = 1.60;
        if (height < 1.80) {
            System.out.print("\nТы низкий");
        } else {
            System.out.print("\nТы высокий");
        }
        String name = "Maksim";
        char FirstLetterOfName = name.charAt(0);
        if (FirstLetterOfName == 'M') {
            System.out.print("\nПервая буква имени М\n");
        } else if (FirstLetterOfName == 'I') {
            System.out.print("\nПервая буква имени I\n");
        } else {
            System.out.print("\nДругая первая буква имени\n");
        }

        System.out.print("\n2.Поиск max и min числа.");
        int firstNumber = 23;
        int secondNumber = -12;
        if (firstNumber > secondNumber) {
            System.out.print("\nПервое число " + firstNumber + " больше, чем второе число " +
             secondNumber + "\n");
        } else {
            System.out.println("\nВторое число " + secondNumber + "больше, чем первое число " +
             firstNumber + "\n");
        }

        System.out.print("\n3.Работа с числом.\n");
        int anyNumber = 23;
        if (anyNumber != 0) {
            System.out.println("Число не равно нулю");
            if (anyNumber % 2 == 0) {
                System.out.println("Число четное");
                if (anyNumber < 0) {
                    System.out.println("Число отрицательное");
                } else {
                    System.out.println("Число положительное");
                }
            } else if (anyNumber % 2 != 0) {
                System.out.println("Число не четное");
                if (anyNumber < 0) {
                    System.out.println("Число отрицательное");
                } else {
                    System.out.println("Число положительное");
                }
            }
        } else {
            System.out.println("Число равно нулю");
        }

        System.out.println("\n4.Поиск одинаковых цифр в числах");
        int ones = 1;
        int dozens = 2;
        int hundreds = 3;
        int firstVariable = 387;
        int secondVariable = 385;
        int onesFirstVariable = firstVariable % 10;
        int dozensFirstVariable = firstVariable / 10 % 10;
        int hundredsFirstVariable = firstVariable / 100 % 10;
        int onesSecondVariable = secondVariable % 10;
        int dozensSecondVariable = secondVariable / 10 % 10;
        int hundredsSecondVariable = secondVariable / 100 % 10;

        if (onesFirstVariable == onesSecondVariable) {
            if (dozensFirstVariable == dozensSecondVariable) {
                if (hundredsFirstVariable == hundredsSecondVariable) {
                    System.out.println("В числах " + firstVariable + " и " + secondVariable +
                     " одинаковые цифры " + onesFirstVariable + " " + dozensFirstVariable + " " +
                      hundredsFirstVariable + " стоят в " + ones + " " + dozens + " " + hundreds +
                       " разрядах");
                } else {
                    System.out.println("В числах " + firstVariable + " и " + secondVariable +
                     " одинаковые цифры " + onesFirstVariable + " " + dozensFirstVariable +
                      " стоят в " + ones + " " + dozens + " разрядах");
                }

            } else if (hundredsFirstVariable == hundredsSecondVariable) {
                System.out.println("В числах " + firstVariable + " и " + secondVariable +
                 " одинаковые цифры " + onesFirstVariable + " " + hundredsFirstVariable +
                  " стоят в " + ones + " " + hundreds + " разрядах");
            } else {
                System.out.println("В числах " + firstVariable + " и " + secondVariable +
                 " одинаковые цифры " + onesFirstVariable + " стоят в " + ones + " разрядах");
            }
        } else if (dozensFirstVariable == dozensSecondVariable) {
            if (hundredsFirstVariable == hundredsSecondVariable) {
                System.out.println("В числах " + firstVariable + " и " + secondVariable +
                 " одинаковые цифры " + dozensFirstVariable + " " + hundredsFirstVariable +
                  " стоят в " + dozens + " " + hundreds + " разрядах");
            } else {
                System.out.println("В числах " + firstVariable + " и " + secondVariable +
                 " одинаковые цифры " + dozensFirstVariable + " стоят в " + dozens + " разрядах");
            }

        } else if (hundredsFirstVariable == hundredsSecondVariable) {
            System.out.println("В числах " + firstVariable + " и " + secondVariable +
             " одинаковые цифры " + hundredsFirstVariable + " стоят в " + hundreds + " разрядах");
        }
        System.out.println("\n5.Определение буквы, числа или символа по их коду");
        char someChar = '\u0057';
        if (someChar >= 48 && someChar <= 57) {
            System.out.println("Cимвол " + someChar + " это число.");
        } else if (someChar >= 65 && someChar <= 90 ||
                someChar >= 97 && someChar <= 122 ||
                someChar >= 128 && someChar <= 175 ||
                someChar >= 224 && someChar <= 241) {
            System.out.println("Cимвол " + someChar + " это маленькая (большая) буква.");
        } else {
            System.out.println("Не буква и не число");
        }

        System.out.println("\n6.Определение суммы вклада и начисленных банком %");
        int depositAmount = 300_000;
        if (depositAmount < 100_000) {
            int annualInterest = depositAmount * 5 / 100;
            System.out.println("Cумма вклада = " + depositAmount + ". Начисленный проц. = " +
             annualInterest + ". Cумма с проц. = " + (depositAmount + annualInterest) + ".");
        } else if (depositAmount < 300_000) {
            int annualInterest = depositAmount * 7 / 100;
            System.out.println("Cумма вклада = " + depositAmount + ". Начисленный проц = " +
             annualInterest + ". Cумма с проц = " + (depositAmount + annualInterest) + ".");
        } else if (depositAmount >= 300_000) {
            int annualInterest = depositAmount * 10 / 100;
            System.out.println("Cумма вклада = " + depositAmount + ". Начисленный проц = " +
             annualInterest + ". Cумма с проц = " + (depositAmount + annualInterest) + ".");
        }

        System.out.print("\n7.Определние оценки по предметам");
        int finalPercentForHistory = 59;
        int finalPercentForProgramming = 91;
        int gradeForHistory = 0;
        int gradeForProgramming = 0;

        if (finalPercentForHistory > 91) {
            gradeForHistory = 5;
            System.out.print("\nОценка за историю = " + gradeForHistory);
        } else if (finalPercentForHistory > 73) {
            gradeForHistory = 4;
            System.out.print("\nОценка за историю = " + gradeForHistory);
        } else if (finalPercentForHistory > 60) {
            gradeForHistory = 3;
            System.out.print("\nОценка за историю = " + gradeForHistory);
        } else if (finalPercentForHistory <= 60) {
            gradeForHistory = 2;
            System.out.print("\nОценка за историю = " + gradeForHistory);
        }

        if (finalPercentForProgramming > 90) {
            gradeForProgramming = 5;
            System.out.print("\nОценка за программирование = " + gradeForProgramming);
        } else if (finalPercentForProgramming > 73) {
            gradeForProgramming = 4;
            System.out.print("\nОценка за программирование = " + gradeForProgramming);
        } else if (finalPercentForProgramming > 60) {
            gradeForProgramming = 3;
            System.out.print("\nОценка за программирование = " + gradeForProgramming);
        } else if (finalPercentForProgramming <= 60) {
            gradeForProgramming = 2;
            System.out.print("\nОценка за программирование = " + gradeForProgramming);
        }
        System.out.print("\nСредний балл оценок по предметам =" +
         ((gradeForHistory + gradeForProgramming) / 2));
        System.out.println("\nСредний % по предметам =" +
         ((finalPercentForHistory + finalPercentForProgramming) / 2));

        System.out.println("\n8.Расчет прибыл");
        int rentForMonth = 5000;
        int averageRevenueForMonth = 13000;
        int costOfGoods = 9000;
        int annualProfit = (averageRevenueForMonth - (rentForMonth + costOfGoods)) * 12;
        if (annualProfit >= 0) {
            System.out.println("Прибыль за года: +" + annualProfit);
        } else {
            System.out.println("Прибыль за года: " + annualProfit);
        }

        System.out.println("\n9.Подсчет количества банкнот");
        int srcSum = 567;
        ones = srcSum % 10;
        dozens = srcSum / 10 % 10;
        hundreds = srcSum / 100 % 10;
        int banknoteDenominationOfOne = 1;
        int banknoteDenominationOfTen = 10;
        int amountBanknoteDenominationOfTen = 5;
        int banknoteDenominationOfHundred = 100;
        int givenAmountBanknotesDenominationOfOne = 0;
        int givenAmountBanknotesDenominationOfTen = 0;
        int givenAmountBanknotesDenominationOfHundred = 0;
        int withdrawalAmount = 0;

        givenAmountBanknotesDenominationOfOne += ones;
        withdrawalAmount = givenAmountBanknotesDenominationOfOne;
        if (amountBanknoteDenominationOfTen >= dozens) {
            givenAmountBanknotesDenominationOfTen = dozens;
            withdrawalAmount += givenAmountBanknotesDenominationOfTen * 10;
        } else {
            int ostatok = dozens - amountBanknoteDenominationOfTen;
            givenAmountBanknotesDenominationOfTen += amountBanknoteDenominationOfTen;
            givenAmountBanknotesDenominationOfOne += ostatok * 10;
            withdrawalAmount = ((givenAmountBanknotesDenominationOfTen * 10) +
            givenAmountBanknotesDenominationOfOne);
        }
        givenAmountBanknotesDenominationOfHundred += hundreds;
        withdrawalAmount += givenAmountBanknotesDenominationOfHundred * 100;

        System.out.println("Номиналы банкнот: " + banknoteDenominationOfOne + " " +
         banknoteDenominationOfTen + " " + banknoteDenominationOfHundred);
        System.out.println("Требуемое количество банкнот номиналом " + banknoteDenominationOfOne +
         " = " + givenAmountBanknotesDenominationOfOne);
        System.out.println("Требуемое количество банкнот номиналом " + banknoteDenominationOfTen +
         " = " + givenAmountBanknotesDenominationOfTen);
        System.out.println("Требуемое количество банкнот номиналом " +
         banknoteDenominationOfHundred + " = " + givenAmountBanknotesDenominationOfHundred);
        System.out.println("Сумма = " + withdrawalAmount);
    }
}

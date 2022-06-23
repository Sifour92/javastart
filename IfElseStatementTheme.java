public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.print("1.Перевод псевдокода на язык Java.");
        int age = 10;
        if (age > 20) {
            System.out.print("\nМожно купить сигареты");
        } else {
            System.out.print("\nНельзя купить сигареты");
        }
        boolean male = false;
        if (!male) {
            System.out.print("\nЭто не мужчина");
        }
        double height = 1.60;
        if (height < 1.80) {
            System.out.print("\nТы низкий");
        } else {
            System.out.print("\nТы высокий");
        }
        String name = "Maksim";
        char firstLetterOfName = name.charAt(0);
        if (firstLetterOfName == 'M') {
            System.out.print("\nПервая буква имени М");
        } else if (firstLetterOfName == 'I') {
            System.out.print("\nПервая буква имени I");
        } else {
            System.out.print("\nДругая первая буква имени");
        }

        System.out.print("\n\n2.Поиск max и min числа.");
        int firstNumber = 23;
        int secondNumber = -12;
        if (firstNumber > secondNumber) {
            System.out.print("\nПервое число " + firstNumber + " больше, чем второе число " +
                    secondNumber);
        } else {
            System.out.print("\nВторое число " + secondNumber + "больше, чем первое число " +
                    firstNumber);
        }

        System.out.print("\n\n3.Работа с числом.");
        int anyNumber = 23;
        if (anyNumber != 0) {
            if (anyNumber < 0) {
                System.out.print("\nЧисло " + anyNumber + " отрицательное");
            } else {
                System.out.print("\nЧисло " + anyNumber + " положительное");
            }
            if (anyNumber % 2 == 0) {
                System.out.print("\nЧисло " + anyNumber + " четное");
            } else if (anyNumber % 2 != 0) {
                System.out.print("\nЧисло " + anyNumber + " не четное");
            }
        } else {
            System.out.print("\nЧисло равно нулю");
        }


        System.out.print("\n\n4.Поиск одинаковых цифр в числах");
        int ones = 1;
        int dozens = 2;
        int hundreds = 3;
        int num1 = 387;
        int num2 = 385;
        int onesNum1 = num1 % 10;
        int dozensNum1 = num1 / 10 % 10;
        int hundredsNum1 = num1 / 100 % 10;
        int onesNum2 = num2 % 10;
        int dozensNum2 = num2 / 10 % 10;
        int hundredsNum2 = num2 / 100 % 10;

        if (onesNum1 == onesNum2) {
            if (dozensNum1 == dozensNum2) {
                if (hundredsNum1 == hundredsNum2) {
                    System.out.print("\nВ числах " + num1 + " и " + num2 + " одинаковые цифры " +
                            onesNum1 + " " + dozensNum1 + " " + hundredsNum1 + " стоят в " + ones +
                            " " + dozens + " " + hundreds + " разрядах");
                } else {
                    System.out.print("\nВ числах " + num1 + " и " + num2 + " одинаковые цифры " +
                            onesNum1 + " " + dozensNum1 + " стоят в " + ones + " " + dozens +
                            " разрядах");
                }
            } else if (hundredsNum1 == hundredsNum2) {
                System.out.print("\nВ числах " + num1 + " и " + num2 +
                        " одинаковые цифры " + onesNum1 + " " + hundredsNum1 +
                        " стоят в " + ones + " " + hundreds + " разрядах");
            } else {
                System.out.print("\nВ числах " + num1 + " и " + num2 +
                        " одинаковые цифры " + onesNum1 + " стоят в " + ones + " разрядах");
            }
        } else if (dozensNum1 == dozensNum2) {
            if (hundredsNum1 == hundredsNum2) {
                System.out.print("\nВ числах " + num1 + " и " + num2 +
                        " одинаковые цифры " + dozensNum1 + " " + hundredsNum1 +
                        " стоят в " + dozens + " " + hundreds + " разрядах");
            } else {
                System.out.print("\nВ числах " + num1 + " и " + num2 +
                        " одинаковые цифры " + dozensNum1 + " стоят в " + dozens + " разрядах");
            }
        } else if (hundredsNum1 == hundredsNum2) {
            System.out.print("\nВ числах " + num1 + " и " + num2 +
                    " одинаковые цифры " + hundredsNum1 + " стоят в " + hundreds + " разрядах");
        }

        System.out.print("\n\n5.Определение буквы, числа или символа по их коду");
        char someChar = '\u0057';
        if (someChar >= 48 && someChar <= 57) {
            System.out.print("\nCимвол " + someChar + " это число.");
        } else if (someChar >= 65 && someChar <= 90 ||
                someChar >= 97 && someChar <= 122 ||
                someChar >= 128 && someChar <= 175 ||
                someChar >= 224 && someChar <= 241) {
            System.out.print("\nCимвол " + someChar + " это маленькая (большая) буква.");
        } else {
            System.out.print("\nНе буква и не число");
        }

        System.out.print("\n\n6.Определение суммы вклада и начисленных банком процент");
        int depositAmount = 300_000;
        int percent=0;
        if (depositAmount < 100_000) {
            percent=5;
        } else if (depositAmount < 300_000) {
            percent=7;
        } else if (depositAmount >= 300_000) {
            percent=10;
        }
        int annualInterest = depositAmount * percent / 100;
        System.out.print("\nCумма вклада = " + depositAmount + ". Начисленный проц = " +
                annualInterest + ". Cумvа с проц = " + (depositAmount + annualInterest) + ".");

        System.out.print("\n\n7.Определение оценки по предметам");
        int historyPercent = 59;
        int csPercent = 91;
        int historyGrade = 0;
        int csGrade = 0;
        if (historyPercent > 91) {
            System.out.print("\nОценка за историю = " + (historyGrade = 5));
        } else if (historyPercent > 73) {
            System.out.print("\nОценка за историю = " + (historyGrade = 4));
        } else if (historyPercent > 60) {
            System.out.print("\nОценка за историю = " + (historyGrade = 3));
        } else {
            System.out.print("\nОценка за историю = " + (historyGrade = 2));
        }
        if (csPercent > 90) {
            System.out.print("\nОценка за программирование = " + (csGrade = 5));
        } else if (csPercent > 73) {
            System.out.print("\nОценка за программирование = " + (csGrade = 4));
        } else if (csPercent > 60) {
            System.out.print("\nОценка за программирование = " + (csGrade = 3));
        } else {
            System.out.print("\nОценка за программирование = " + (csGrade = 2));
        }
        System.out.print("\nСредний балл оценок по предметам =" +
                ((historyGrade + csGrade) / 2));
        System.out.print("\nСредний % по предметам =" +
                ((historyPercent + csPercent) / 2));

        System.out.print("\n\n8.Расчет прибыл");
        int rentForMonth = 5000;
        int averageRevenueForMonth = 13000;
        int costOfGoods = 9000;
        int annualProfit = (averageRevenueForMonth - (rentForMonth + costOfGoods)) * 12;
        if (annualProfit >= 0) {
            System.out.print("\nПрибыль за года: +" + annualProfit);
        } else {
            System.out.print("\nПрибыль за года: " + annualProfit);
        }

        System.out.print("\n\n9.Подсчет количества банкнот");
        int srcSum = 567;
        ones = srcSum % 10;
        dozens = srcSum / 10 % 10;
        hundreds = srcSum / 100 % 10;
        int banknoteDenominationOfOne = 1;
        int banknoteDenominationOfTen = 10;
        int amountBanknoteDenominationOfTen = 5;
        int banknoteDenominationOfHundred = 100;
        int amountBanknotesOne = 0;
        int amountBanknotesTen = 0;
        int amountBanknotesHundred = 0;
        int withdrawalAmount = 0;
        amountBanknotesOne = ones;
        if (amountBanknoteDenominationOfTen >= dozens) {
            amountBanknotesTen = dozens;
        } else {
            int difference = dozens - amountBanknoteDenominationOfTen;
            amountBanknotesTen += amountBanknoteDenominationOfTen;
            amountBanknotesOne += difference * 10;
        }
        amountBanknotesHundred = hundreds;
        withdrawalAmount = amountBanknotesOne + (amountBanknotesTen * 10) + (amountBanknotesHundred * 100);
        System.out.println("Номиналы банкнот: " + banknoteDenominationOfOne + " " +
                banknoteDenominationOfTen + " " + banknoteDenominationOfHundred);
        System.out.println("Требуемое количество банкнот номиналом " +
                banknoteDenominationOfOne + " = " + amountBanknotesOne);
        System.out.println("Требуемое количество банкнот номиналом " +
                banknoteDenominationOfTen + " = " + amountBanknotesTen);
        System.out.println("Требуемое количество банкнот номиналом " +
                banknoteDenominationOfHundred +" = " + amountBanknotesHundred);
        System.out.println("Сумма = " + withdrawalAmount);
    }
}
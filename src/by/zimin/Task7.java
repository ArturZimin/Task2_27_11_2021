package by.zimin;

import java.util.Scanner;

public class Task7 {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /**7.	Используя сканнер введите 5 целых чисел, распечатайте результаты:
         * a.	Сумма всех чисел.
         * b.	 Четные и нечетные числа.
         * c.	 Наибольшее и наименьшее число.
         * d.	 Числа, которые делятся на 3 или на 9.
         * e.	 Числа, которые делятся на 5 и на 7.
         * f.	 Числа, которые после ввода находились в порядке убыванию.
         * g.	 Числа, которые после ввода находились в порядке возрастания.
         * h.	 * Числа, которые равны полу сумме соседних элементов.
         * i.	Выведите все числа в порядке убывания, возрастания.*/


        int numbers[] = new int[5];
        System.out.println("Enter one number !");
        numbers[0] = scan.nextInt();
        System.out.println("Enter two number !");
        numbers[1] = scan.nextInt();
        System.out.println("Enter three number !");
        numbers[2] = scan.nextInt();
        System.out.println("Enter four number !");
        numbers[3] = scan.nextInt();
        System.out.println("Enter five number !");
        numbers[4] = scan.nextInt();
        int min = numbers[0];
        int max = numbers[0];
        int even[] = new int[5];
        int odd[] = new int[5];
        int divisibleByThreeOrNine[] = new int[5];
        int divisibleByFiveAndSeven[] = new int[5];

        int descending[] = new int[5];
        int ascending[] = new int[5];
        int sumOfNumbers = 0;
        int count = 1;
        int count1 = 0;
        int count2 = 3;
        for (int i = 0; i < numbers.length; i++) {


            int temp = numbers[i];
            if (i == 0 || i == 4) {
                continue;
            } else {
                int halfSum = (numbers[count1] + numbers[count2]) / 2;
                if (numbers[i] == halfSum) {
                    System.out.println("The number equal half sum:" + halfSum);

                }

            }
            sumOfNumbers += temp;
            if (temp % 9 == 0 || temp % 3 == 0) {
                divisibleByThreeOrNine[i] = temp;
            }
            if (temp % 5 == 0 && temp % 7 == 0) {
                divisibleByFiveAndSeven[i] = temp;
            }


            if (numbers[count] < numbers[i]) {
                descending[i] = numbers[i];

            } else {
                ascending[i] = numbers[count];
            }
            if (count == 4) {
                continue;
            } else {
                count++;
            }


            if (temp % 2 == 0) {
                even[i] = temp;
            } else {
                odd[i] = temp;
            }
            if (max < temp) {
                max = temp;
            }
            if (min > temp) {
                min = temp;
            }
        }
        System.out.println("The sum of all numbers : " + sumOfNumbers);

        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);
        for (int e = 0; e < even.length; e++) {
            if (even[e] == 0) {
                continue;
            } else {
                System.out.println("Even numbers: " + even[e]);
            }

        }
        for (int ab = 0; ab < odd.length; ab++) {
            if (odd[ab] == 0) {
                continue;
            } else {
                System.out.println("Odd numbers: " + odd[ab]);
            }
        }
        for (int y = 0; y < divisibleByThreeOrNine.length; y++) {
            if (divisibleByThreeOrNine[y] == 0) {
                continue;
            } else {
                System.out.println("The numbers that are divisible by 3 or 9: " + divisibleByThreeOrNine[y]);

            }
        }
        for (int f = 0; f < divisibleByFiveAndSeven.length; f++) {
            if (divisibleByFiveAndSeven[f] == 0) {
                continue;
            } else {
                System.out.println("The numbers that are divisible by 5 and 7: " + divisibleByFiveAndSeven[f]);
            }
        }
        for (int i = 0; i < ascending.length; i++) {
            if (ascending[i] == 0) {
                continue;
            } else {
                System.out.println("The numbers ascending :" + ascending[i]);
            }
        }
        for (int i = 0; i < descending.length; i++) {
            if (descending[i] == 0) {
                continue;
            } else {
                System.out.println("The numbers descending :" + descending[i]);
            }
        }

        System.out.println("Sort ascending : ");//по возрастанию
        SelectionSort.selectionSort(numbers);
        for (int t = 0; t < numbers.length; t++) {
            System.out.println("Sort " + numbers[t]);
        }
        System.out.println("Sort descending : ");//по убыванию

        SelectionSort.selectionSort(numbers);
        for (int r = numbers.length - 1; r >= 0; r--) {
            System.out.println("Sort " + numbers[r]);
        }
    }
}
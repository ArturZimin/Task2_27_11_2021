package by.zimin;

import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        /**Задание 1
         Пользователь вводит с клавиатуры число. Необходимо проверить его на четность и нечетность. Если число
         четное требуется вывести на экран число и надпись «Even
         number». Если число нечетное выведите на экран число
         и надпись «Odd number».*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number !");
        int number = sc.nextInt();
        boolean evenOrOdd;
        evenOrOdd = (number % 2 == 0) ? true : false;
        if (evenOrOdd == true) {
            System.out.println("Even number: " + number);
        } else {
            System.out.println("Odd number: " + number);

        }

/**Задание 2
 Пользователь вводит с клавиатуры три числа. В зависимости от выбора пользователя программа выводит
 на экран сумму трёх чисел или произведение трёх чисел.*/
        System.out.println("Enter one number !");
        int one = sc.nextInt();
        System.out.println("Enter two number !");
        int two = sc.nextInt();
        System.out.println("Enter three number !");
        int three = sc.nextInt();
        System.out.println("1 (sum) or 2 (product)");
        int choose = sc.nextInt();
        if (choose == 1) {
            int sum = one + two + three;
            System.out.println("Sum of numbers : " + sum);
        } else if (choose == 2) {
            int productNumbers = one * two * three;
            System.out.println("Product of numbers : " + productNumbers);

        } else {
            System.out.println("You entered the wrong number , Goodbye!");
        }

        /**Задание 3
         Пользователь вводит с клавиатуры три числа. В зависимости от выбора пользователя программа выводит
         на экран максимум из трёх, минимум из трёх или среднеарифметическое трёх чисел.*/
        System.out.println("Enter one number !");
        int one1 = sc.nextInt();
        System.out.println("Enter two number !");
        int two1 = sc.nextInt();
        System.out.println("Enter three number !");
        int three1 = sc.nextInt();
        System.out.println("1 (max) or 2 (min) or 3 (average)");
        int choose1 = sc.nextInt();
        if (choose1 == 1) {
            int max = one1;
            if (two1 > max) {
                max = two1;
            } else if (three1 > max) {
                max = three1;
            }
            System.out.println("Max number : " + max);

        } else if (choose1 == 2) {
            int min = one1;
            if (two1 < min) {
                min = two1;
            } else if (three1 < min) {
                min = three1;
            }
            System.out.println("Min number : " + min);

        } else if (choose1 == 3) {
            double average = (double) (one1 + two1 + three1) / 3;
            System.out.println("Average number : " + average);
        }
/**1.	В переменных a и b хранятся два целых числа.
 Ваша программа должна вывести в консоль результат деления a на b с остатком.
 (подсказка – исп. оператор ‘%’
 https://javarush.ru/groups/posts/operator-deleniya-po-modulyu )
 Пример:

 */

        int a = 30;
        int b = 20;
        int modul = a % b;
        System.out.println("Remainder of the division = " + modul);
       /**2.	В переменной x хранится двузначное  целое число.
       Ваша программа должна вывести в консоль  сумму цифр этого числа.
       Пример:*/

        int sum = 0;
        int x = 98;
        while (x > 0) {
            int remainderOfDivision = x % 10;
            sum += remainderOfDivision;
            x /= 10;
        }
        System.out.println("The sum of digit the number = " + sum);

        /**3.	В переменной x хранится число с дробной частью.
         Ваша программа должна вывести в консоль округленное число x до ближайшего целого.
         */
        int number3 = 0;
        double x = 3.6;
        double remainderOfDivision = x % 1.0;
        if (remainderOfDivision > 0.5) {
            x += 1;
            number3 = (int) x;
        }
        number3 = (int) x;
        System.out.println("Integer number = " + number3);

        /**4.	В переменной x хранится целое пятизначное число.
         Создайте программу, вычисляющую и выводящую на экран сумму цифр числа x.
         //         */
        int fiveDigitNumber = 34567;
        int sumOfDigitNumber = 0;
        while (fiveDigitNumber > 0) {
            int remainderOfDivisionFiveDigitNumber = fiveDigitNumber % 10;
            sumOfDigitNumber += remainderOfDivisionFiveDigitNumber;
            fiveDigitNumber /= 10;
        }
        System.out.println("The sum of five digit-number = " + sumOfDigitNumber);

        /** task 5 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter one month of number !");
        int one = scan.nextInt();
        System.out.println("Enter two month of number !");
        int two = scan.nextInt();
        System.out.println("Enter three month of number !");
        int three = scan.nextInt();
        int year = 365;
        if (one > two) {
            year /= one;
        } else {
            year /= two;
        }
        if (year > three) {
            System.out.println("Year :" + year);
        } else {
            System.out.println("Mart :" + three);
        }

        /**task 6 */

        System.out.println("How old are you ? ");
        int age = scan.nextInt();
        if (age >= 18 && age <= 27) {
            System.out.println("You are subject to conscription or you can serve under a contract.");
        }
        if (age >= 28 && age <= 59) {
            System.out.println(" You can serve under a contract.");

        }
        if (age > 0 && age < 18 || age > 59 && age <= 99) {
            System.out.println(" You age is not conscription.");

        }
        if (age < 0 || age >= 100) {
            System.out.println("Error! Something went wrong start over!31 ");

        }

        /**
         * 8.	Найти площадь параллелограмма используя все 3 способа
         * 1. Площадь параллелограмма равна произведению стороны на высоту, проведенную к этой стороне.
         * ∙ 2. Площадь параллелограмма равна произведению сторон на синус угла между ними. ∙
         * 3. Площадь параллелограмма (как и любого четырехугольника) равна половине произведения
         * диагоналей на синус угла между ними.
         *
         * Источник: https://shkolkovo.net/theory/129
         * © shkolkovo.net
         * S=A*Ha
         * S=ab*sin_a
         * S=
         * */

        System.out.println("Enter the side 'a");
        double a = scan.nextDouble();
        System.out.println("Enter the height 'h");
        double h = scan.nextDouble();

        double s = a * h;
        System.out.println("Area is even(1 method): " + s);
        System.out.println("Enter the angle 'angle");
        double angle = scan.nextDouble();
        double s2 = a * h * Math.sin(Math.PI / angle);
        System.out.println("Area is even(2 method): " + s2);
        System.out.println("Enter the one diagonal :");
        double diagonal = scan.nextDouble();
        System.out.println("Enter the two diagonal :");
        double diagonal1 = scan.nextDouble();
        double s3 = 0.5 * diagonal * diagonal1 * Math.sin(Math.PI / angle);
        System.out.println("Area is even(3 method): " + s3);


        /** 9.	Даны три переменные вещественного типа: a,b,c.
         Если их значения упорядочены по возрастанию (порядок инициализации), то удвоить их;
         в противном случае заменить значение каждой переменной на противоположное.
         Вывести новые значения переменных a,b,c.

         */

        System.out.println("Enter  real number one(example 2,23)  ");
        double firstD = scan.nextDouble();
        System.out.println("Enter  real number two (example 1,23) ");
        double secondD = scan.nextDouble();
        System.out.println("Enter  real number three  (example 5,23)");
        double thirtyD = scan.nextDouble();
        if (firstD <= secondD && secondD <= thirtyD) {
            firstD = firstD * firstD;
            secondD = secondD * secondD;
            thirtyD = thirtyD * thirtyD;
        } else {
            firstD = firstD * -1;
            secondD = secondD * -1;
            thirtyD = thirtyD * -1;
        }
        System.out.println("Number one = " + firstD);
        System.out.println("Number two = " + secondD);
        System.out.println("Number three = " + thirtyD);

/**10.	 Даны четыре целых числа, одно из которых отлично от трех других, равных между собой.
 *  Определить порядковый номер числа (номер при инициализации), отличного от остальных.*/
        System.out.println("Enter one number identical or unique");
        int e = scan.nextInt();
        System.out.println("Enter two number identical or unique ");
        int b = scan.nextInt();
        System.out.println("Enter  three number identical or unique ");
        int c = scan.nextInt();
        System.out.println("Enter  four number identical or unique ");
        int d = scan.nextInt();

        if (e > b || e < b && e != c) {
            System.out.println("Excellent number: " + e);
        } else if (b > e || b < e && b != c) {
            System.out.println("Excellent number: " + b);

        } else if (c > e || c < e && c != b) {
            System.out.println("Excellent number: " + c);

        } else if (d > c || d < c && d != b) {
            System.out.println("Excellent number: " + d);

        }

        /**11.	Даны три числа. Найти сумму двух наибольших из них.*/
        System.out.println("Enter one number ");
        int y = scan.nextInt();
        System.out.println("Enter two number ");
        int u = scan.nextInt();
        System.out.println("Enter  three number  ");
        int i = scan.nextInt();
        int max, min;

        if (y <= u && y <= i) {
            min = y;
            System.out.println("Sum two max numbers: " + (u + i));
        } else if (u <= y && u <= i) {
            min = u;
            System.out.println("Sum two max numbers: " + (i + y));
        } else {
            min = i;
            System.out.println("Sum two max numbers: " + (u + y));
        }

        /**12.	* Даны координаты точки и радиус круга с центром в начале координат.
         * Определить, принадлежит ли данная точка кругу.

         Алгоритм решения задачи:
         Следует рассмотреть прямоугольный треугольник, один катет которого лежит на любой оси,
         а другой является перпендикуляром к этой оси из заданной точки.
         В этом случае длины катетов равны значениям x и y, а гипотенуза является отрезком,
         соединяющим начало координат с точкой. Если этот отрезок не больше радиуса круга,
         то делается вывод, что точка принадлежит кругу.
         Длина гипотенузы находится по теореме Пифагора.
         Используйте след. код для нахождения корня:
         double result =  Math.sqrt(9); // после выполнения result == 3
         */
        System.out.println("Enter point coordinates -'x'");
        double x = scan.nextDouble();
        System.out.println("Enter point coordinates -'y'");
        double y = scan.nextDouble();
        System.out.println("Enter  radius circle -'r'");
        double r = scan.nextDouble();
        double hypotenuse = Math.sqrt(y * y + x * x);

        if (hypotenuse > r) {
            System.out.println("The point does not belong to the circle");
            System.out.println("x= " + x);
            System.out.println("y= " + y);
            System.out.println("r= " + r);
            System.out.println("Hypotenuse = " + hypotenuse);
        } else {
            System.out.println("The point  belong to the circle");
            System.out.println("x= " + x);
            System.out.println("y= " + y);
            System.out.println("r= " + r);
            System.out.println("Hypotenuse = " + hypotenuse);
        }

        /**13.	Нарисуйте объекты в консоли. Ваша программа должна нарисовать что-то.
         *  Сложность рисунка влияет на оценку. Сложность определяет преподаватель.   */
        Random r = new Random();
        int random = (int) (r.nextInt(44));
        int count = 0;
        while (count <= 3) {
            if (count == 0) {
                System.out.println(("...........................................A......................................."));
                System.out.println((".........................................AAAAA....................................."));
                System.out.println(("......................................AAAAAAAAAAA.................................."));

            }
            System.out.println((".........................................jkjk.........................................."));

            System.out.println(("......................................jjkjkjkjjk......................................."));
            System.out.println(("...................................kjkjklknllnjjkjoi..................................."));
            System.out.println(("..............................jkhkhkjhlkjlkjkjkjkjkjkjkkj.............................."));
            System.out.println(("..........................jhjhlkmnlkjkjgyutiuhoiuoiupoiopippiu........................."));
            System.out.println(("....................hjgkjhlkjhlkjlkjlkj;lkj;lk;lk;k;lk;lk;lk;lk;lk;lk............,,,,.."));
            if (count == 3) {
                System.out.println(("...................................j;lk;lk;k;lk;lk;................................"));
                System.out.println(("...................................j;lk;lk;k;lk;lk;................................"));
                System.out.println(("...................................j;lk;lk;k;lk;lk;................................"));

            }
            count++;
        }

        /**14.	Игра угадай число.
         Пользователь задает диапазон угадываемого им числа с клавиатуры. (верхний и нижний пределы)
         Пользователь задает количество попыток что бы угадать число с клавиатуры.
         Если это произошло – выдать сообщение «Вы выйграли»
         Примерный интерфес программы:
         */
        System.out.println("Set the range of the guessed number from 0 to: ");
        int guessNumber = scan.nextInt();
        System.out.println("Number of attempts: ");
        int numberOfAttempts = scan.nextInt();
        Random r1 = new Random();
        int rand = r1.nextInt(guessNumber);
        while (numberOfAttempts > 0) {
            System.out.println(" Enter the number ");
            int num = scan.nextInt();
            if (num == rand) {
                System.out.println("You guessed number, congratulations!");
                break;
            } else {
                System.out.println("Try again !");
            }
            if (numberOfAttempts == 1) {
                System.out.println("Your attempts are finished ,Goodbye!");
                System.out.println("The number is correct: " + rand);
            }
            numberOfAttempts--;
        }


    }

}


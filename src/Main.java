import java.sql.SQLOutput;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int begin = 0;
        int salary = 15000;
        int i =0;
        while (begin < 2459000) {
            begin = begin + begin/ 100;
            begin = begin + salary;
            i = i + 1;
            if (begin >= 2459000) {
                System.out.println("Месяц " + i + " итого " + begin);
            }

            }

        System.out.println("Задача 2");
        int start = 1;
        while (start <= 10) {
            System.out.print ( start );
            start = start + 1;
        }
        System.out.println();
        for (int o = 10; o >=1; o --) {
            System.out.print( o );

        }
        System.out.println();

        System.out.println("Задача 3");
        int y = 12000000;
        int z = 17;
        int x = 8;
        int s = 0;
        do { System.out.println("Год " + s + ", численность населения составляет " + y);
            y = y + (y * (z - x)/1000);
            s = s + 1;

        }
        while (s <= 10);

        System.out.println("Задача 4");
        int q = 15000;
        int w = 12000000;
        int month = 0;
        do { System.out.println("Месяц " + month + " сумма накоплений равна " + q);
            q =q + (q /100 * 7);
            month = month +1;
        }
        while (q <= w);
        System.out.println("Месяц " + month + " сумма накоплений равна " + q);



        System.out.println("Задача 5");
        int e = 15000;
        int r = 12000000;
        int monthS = 0;
        while (e < r) {
            e =e + (e /100 * 7);
            monthS = monthS +1;
            if ( monthS % 6 == 0) {
                System.out.println("Месяц " + monthS + " сумма накоплений равна " + e); }
        }

        System.out.println("Задача 6");
        int t = 15000;
        int year = 108;
        int monthR = 0;
        do {
            t = t + (t / 100 * 7);
            monthR = monthR + 1;
            if (monthR % 6 == 0) {
                System.out.println("Месяц " + monthR + " сумма накоплений равна " + t);
            }
        }
            while (year >= monthR);

        System.out.println("Задача 7");
        int friday = 1;
        int allDays = 31;
        do {
            System.out.println("Сегодня пятница," + friday + "-е число. Необходимо подготовить отчет");
            friday = friday + 7;
        }
        while (allDays > friday);






















    }
}
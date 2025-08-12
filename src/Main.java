
public class Main {
    public static void main(String[] args) {

        System.out.printf(" Home Work 7 ");

// Task 1
        System.out.println(" Task 1 ");

        int cash = 15000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            total = total + cash;
            month++;
            System.out.println(" Месяц " + month + " сумма накоплений равна " + total + " рублей. ");
        }

        // Task 2
        System.out.println(" Task 2 ");

        int first = 1;
        while (first <= 10) {
            System.out.print(first + " ");
            first++;
        }

        System.out.println();

        for (int second = 10; second > 0; second--) {
            System.out.print(second + " ");
        }

        // Task 3
        System.out.println(" Task 3 ");

        int countryY = 12_000_000;
        int bornPeople = 17;
        int deathPeople = 8;
        int years = 10;

        for (int t = 1; t <= years; t++) {
            int newBirths = countryY * bornPeople / 1000;
            int deaths = countryY * deathPeople / 1000;
            countryY = countryY + newBirths - deaths;
            System.out.println("Год " + t + ", численность населения составляет " + countryY);
        }

// Task 4
        System.out.println(" Task 4 ");


        int money = 15000;
        int month1 = 0;
        int percent = 7;
        int total1 = money;
//        while (total1 < 12_000_000) {
        for (; total1 < 12_000_000; ) {
//            total1 += total1 * percent / 100;
            total1 = total1 + (total1 * percent / 100);
            month1++;
            System.out.println(" Месяц " + month1 + " сумма накоплений равна " + total1 + " рублей. ");
        }

        // Task 5
        System.out.println(" Task 5 ");

        int money22 = 15000;
        int month22 = 1;
        int percent22 = 7;
        int total22 = money22;
        for (; total22 < 12_000_000; month22++) {
            total22 = total22 + (total22 * percent22 / 100);
            if (month22 % 6 == 0) {
                System.out.println(" Месяц " + month22 + " сумма накоплений равна " + total22 + " рублей. ");
            }
        }

        // Task 6
        System.out.println(" Task 6 ");

        int money23 = 15000;
        int years23 = 9;
        int percent23 = 7;
        int total23 = money23;
        int monthsInYear = 12;
        int allNeedsMonths = years23 * monthsInYear;
        for (int t23 = 1; t23 <= allNeedsMonths; t23++) {
            if (t23 % 6 == 0) {
                total23 += total23 * percent23 / 100;
                System.out.println(" Месяц " + t23 + " сумма накоплений равна " + total23 + " рублей. ");
            }
        }
    }


}








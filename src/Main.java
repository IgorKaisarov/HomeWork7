
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

    }


}


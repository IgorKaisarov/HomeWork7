
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
            first ++;
        }

        System.out.println();

        for (int second = 10; second > 0; second--) {
            System.out.print(second + " ");
        }

        // Task 3
        System.out.println(" Task 3 ");




    }
}

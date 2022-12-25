package TPModul3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Restaurant machine = new Restaurant();
            int customerID, orderQty;
            try {

                System.out.println("Please enter Customer ID: ");
                customerID = input.nextInt();

                System.out.println("Please enter how much food to made: ");
                orderQty = input.nextInt();

                Thread t1 = new Thread(machine);
                Waiters waiter = new Waiters(customerID, orderQty);
                Thread t2 = new Thread(waiter);

                t1.start();
                t2.start();
                t1.join();
                t2.join();

            } catch (Exception e) {
                System.out.println("Sorry, Input must be Integer");
            }
        }

    }

}
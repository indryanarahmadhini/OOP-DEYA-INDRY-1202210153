package TPModul3;

public class Waiters implements Runnable {

    private final int orderQty;
    private final int customerID;
    static int foodPrice = 16500;

    public Waiters(int customerID, int orderQty) {
        this.customerID = customerID;
        this.orderQty = orderQty;
    }

    @Override
    public void run() {
        // call getFood method and pending it to 5000 ms
        while (true) {
            getFood();
            try {
                Thread.sleep(14000);
            } 
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void orderInfo() {
        System.out.println("==========================================================");
        System.out.println("Customer ID: " + this.customerID);
        System.out.println("Number of Food: " + this.orderQty);
        System.out.println("Total Price: " + this.orderQty * foodPrice);
        System.out.println("==========================================================");
    }
    // create synchronized method getFood

    public void getFood() {
        synchronized(Restaurant.getLock()) {

            System.out.println("Waiter: Food is ready to deliver");
            Restaurant Restaurant = new Restaurant();
            Restaurant.setWaitingForPickup(false);

            // check if value of getFoodNumber form Restaurant class is equal to orderQty
            // if same, call method orderInfo() to print order info and exit the program
            if (TPModul3.Restaurant.getFoodNumber() == this.orderQty + 1) {
                orderInfo();
                System.exit(0);
            }
            TPModul3.Restaurant.getLock().notifyAll();
            System.out.println("Waiter: Tell the restaurant to make another food\n");

        }
    }
}
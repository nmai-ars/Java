package Ex2_5;

public class testMain {
	public static void main(String[] args) {
        Customer customer1 = new Customer(108, "Ng Mai", 'f');
        System.out.println("Customer Info: " + customer1);

        Account account1 = new Account(5001, customer1, 1000.50);
        System.out.println("Account Info: " + account1);

        account1.deposit(500.75);
        System.out.println("After deposit of 500.75: " + account1);

        account1.withdraw(300.25);
        System.out.println("After withdrawal of 300.25: " + account1);

        account1.withdraw(1500);
        System.out.println("After attempting to withdraw 1500: " + account1);
    }
}

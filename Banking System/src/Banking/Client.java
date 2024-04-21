package Banking;

import java.util.Random;

public class Client extends Person {
    private String countNumber;
    private double balance;

    public Client(String name, String cpf, String phone, String email, String address) {
        super(name, cpf, phone, email, address);
        this.countNumber = generateAccountNumber();
        this.balance = 0.0; // Initializes balance to zero
    }

    private String generateAccountNumber() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            sb.append(random.nextInt(10));
        }

        return sb.toString();
    }

    public String getCountNumber() {
        return countNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of " + amount + " successful. New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance to make withdrawal.");
        }
    }
}

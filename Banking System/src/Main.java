import Banking.Client;
import Banking.Register;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Register register = new Register();

        System.out.println("Welcome to the banking system!");

        System.out.println("Please enter your information:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Phone: ");
        String phone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();

        Client newClient = new Client(name, cpf, phone, email, address);
        register.addClient(newClient);

        System.out.println("Client registered successfully. Your account number is: " + newClient.getCountNumber());

        // Requesting password and banking operations
        System.out.println("Please enter your password to access your account:");
        String password = scanner.nextLine();
        // Here you can add logic to verify the password and allow access to banking operations
        // For simplicity, we'll just show the balance in this example
        System.out.println("Your balance is: " + newClient.getBalance());

        // Banking operations (example)
        // newClient.deposit(100.0);
        // newClient.withdraw(50.0);
    }
}

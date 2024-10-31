import java.util.Scanner;
//The line import java.util.Scanner imports the "Scanner" class from Java's java.util package. 
//The Scanner class is used for getting user input, from the console.

public class BankApplication {

    // Constructor for BankApplication class (which is currently not in use)
    public BankApplication() {
    }

    // Main method - entry point of the program
    public static void main(String[] args) {
        
        // Create a Scanner object to read user input from the console
        Scanner scanner = new Scanner(System.in);
        
        // Initialize a BankAccount with a starting balance of R1000.0
        BankAccount account = new BankAccount(1000.0);

        int choice; // Variable to store user's menu choice
        
        // Start a do-while loop to repeatedly show the menu until user chooses to exit
        do {
            // Display the menu options
            System.out.println("\n--- Bank Account Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            // Read user choice
            choice = scanner.nextInt();
            
            // Perform actions based on user's choice
            switch (choice) {
                case 1:
                    // Option 1: Display the current balance
                    System.out.println("Current Balance: R" + account.getBalance());
                    break;
                case 2:
                    // Option 2: Deposit money
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble(); // Read deposit amount
                    account.deposit(depositAmount); // Deposit amount into the account
                    break;
                case 3:
                    // Option 3: Withdraw money
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble(); // Read withdrawal amount
                    account.withdraw(withdrawAmount); // Withdraw amount from the account
                    break;
                case 4:
                    // Option 4: Exit the application
                    System.out.println("Thank you for using the bank application. Goodbye!");
                    break;
                default:
                    // Handle invalid choices
                    System.out.println("Invalid choice. Please try again.");
            }
        } while(choice != 4); // Repeat until user chooses to exit by selecting option 4

        // Close the scanner to free up resources
        scanner.close();
    }
}
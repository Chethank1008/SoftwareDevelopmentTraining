import java.util.Scanner;

public class AtmMachine {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    atmMachine.start();
    }

    public void start() {
        System.out.println("Welcome to the ATM Machine");
        boolean cardVerified = verifyCardDetails();
        if(cardVerified) {
            boolean pinVerified = verifyPin();
            if(pinVerified) {
                String language = chooseLanguage();
                displayAccountDetails(language);
                displayOptions();
            } else {
                System.out.println("Invalid PIN!");
            }
        } else {
            System.out.println("Card verification failed.");
        }
    }

    public boolean verifyCardDetails() {
        System.out.println("Enter card Number");
        String cardNumber = scanner.nextLine();
        return cardNumber.length() == 16;
    }

    public boolean verifyPin() {
        System.out.println("Enter PIN");
        String pin = scanner.nextLine();
        return pin.equals("1234");
    }

    public String chooseLanguage() {
        System.out.println("Choose Language");
        System.out.println("1. English");
        System.out.println("2. Hindi");
        int choice = Integer.parseInt(scanner.nextLine());
        String selectedLanguage = "English";
        switch (choice) {
            case 1:
                System.out.println("You have chosen English");
                selectedLanguage = "English";
                break;

            case 2:
                System.out.println("You have chosen Hindi");
                selectedLanguage = "Hindi";
                break;

            default:
                System.out.println("Invalid Choice, English is selected ny default.");
                selectedLanguage = "English";

        }
        return selectedLanguage;

    }
}

public void displayAccountDetails(String language) {
    String accountHolderName = "Chethan";
    String accountNumber = "1234 5678 9101";
    String balance = "10,000$";
    
}


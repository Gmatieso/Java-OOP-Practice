package Dayone.assignment;

public class BankAccount {
    // attributes and methods

    int accountNumber;
    String accountHolderName;
    float accountBalance ;


    void deposit(float amount) {
        //Amount to deposit shld be 100 +
        if (amount > 100) {
            accountBalance += amount;
            System.out.println("Deposited Ksh" + amount);
        } else {
            System.out.println("Not enough money to deposit in your account, Please try again...");
        }

    }

    void withdraw(float amount) {
        if (amount > 0 && amount < 100) {
            accountBalance -= amount;
            System.out.println("Withdraw Ksh" + amount);
        } else if (amount > accountBalance) {
            System.out.println("Insufficient funds to withdraw in your account");
        } else {
            System.out.println("Invalid withdrawal amount");
        }

    }

    void checkBalance() {
        System.out.println("Account balance is " + accountBalance);
    }

    void displayInfo(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
    }


    public static void main(String[] args) {
        // object to perform deposit, withdrawal  and display
        BankAccount bankAccount = new BankAccount();
        bankAccount.accountHolderName = "Rajesh";
        bankAccount.accountNumber = 1036653;


        bankAccount.deposit(150);
        bankAccount.withdraw(50);


        bankAccount.checkBalance();
        bankAccount.displayInfo();

    }
}

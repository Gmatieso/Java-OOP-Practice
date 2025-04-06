package DayEight.AbstractClassAssignment;

/*
    Lets create an abstract class that contains both abstract and non-abstract methods. This will define common structure for bank accounts.
    Here we would want to implement real-time usecase of a banking system where different types of accounts (Savings and Current) will hv common and specific behaviour.
 */

public abstract class BankAccount {
    static String  accountNumber;
    double bankBalance;



     BankAccount(String accountNumber, int bankBalance) {
        this.accountNumber = accountNumber;
        this.bankBalance = bankBalance;
    }

    abstract double calculateInterest();

    void deposit(int amount) {
        bankBalance += amount;
    }


    void withdraw(int amount) {
        bankBalance -= amount;
    }

    final void displayAccountBalance() {
        System.out.println("Account Balance: " + bankBalance);
    }

     static  void provideBankDetails(){
        System.out.println("Bank details");
        System.out.println("Account Number:" + accountNumber);
    }
}

class SavingsAccount extends BankAccount{
    private double interestRate;
    private double time;

    public SavingsAccount(String accountNumber, int Bankbalance, double interestRate,double time) {
        super(accountNumber, Bankbalance);
        this.interestRate = interestRate;
        this.time = time;
    }


    @Override
    double calculateInterest() {
        // P * r * t
        double interest = interestRate * bankBalance * time;
       return bankBalance += interest;
    }

    void display(){
        System.out.println("Account Balance: " + bankBalance);
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Interest Accrued for SavingsAccount " + calculateInterest());
    }
}

class CurrentAccount extends BankAccount{
    private double interestRate;
    private double time;

    CurrentAccount(String accountNumber, int bankBalance, double interestRate,double time) {
        super(accountNumber, bankBalance);
        this.interestRate = interestRate;
        this.time = time;
    }

    @Override
    double calculateInterest() {
        // no interest is added, so use interestRate, as 0
        double interest = interestRate * bankBalance * time;
        System.out.println("Interest accrued for Current account: " + interest);
       return bankBalance += interest;
    }

    void display(){
        System.out.println("Account Balance: " + bankBalance);
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Total amount  Accrued with interest for currentAccount " + calculateInterest());
    }
}




class BankDemo {
    public static void main(String[] args) {

        // lets create an object of SavingsAccount and CurrentAccount.
        SavingsAccount savingsAccount = new SavingsAccount("SavingsAccount", 5000, 0.05, 3);
        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);
        savingsAccount.display();

        CurrentAccount currentAccount = new CurrentAccount("CurrentAccount", 2000, 0.02, 2);
        currentAccount.deposit(500);
        currentAccount.withdraw(200);
        currentAccount.display();
    }
}


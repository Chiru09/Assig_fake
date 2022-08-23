import java.util.Scanner;


abstract class Account {
    int acc_no;
    String name;
    double balance = 0;

    abstract void displayBalance();

    abstract void deposit(double amount);

    abstract void withdraw(double amount);

}

class SavingAccount extends Account {

    String type;
    double interestRate;

    void setData(int accno, String name, String type, double interestRate) {
        this.acc_no = accno;
        this.name = name;
        this.type = type;
        this.interestRate = interestRate;
    }

    @Override
    void displayBalance() {
        System.out.println("Account number: " + acc_no);
        System.out.println("Balance: " + balance);
    }

    @Override
    void deposit(double amount) {
        balance += amount;
    }

    @Override
    void withdraw(double amount) {
        if (amount > balance)
            System.out.println("Low balance");
        else
            balance -= amount;
    }

    void calculateInterest(double time) {
        double interest = (balance * time * interestRate) / 100;

        System.out.println("Interest: Rs." + interest);
    }
}

class CurrentAccount extends Account {

    String type;
    double interestRate;

    void setData(int accno, String name, String type, double interestRate) {
        this.acc_no = accno;
        this.name = name;
        this.type = type;
        this.interestRate = interestRate;
    }

    @Override
    void displayBalance() {
        System.out.println("Account number: " + acc_no);
        System.out.println("Balance: " + balance);
    }

    @Override
    void deposit(double amount) {
        balance += amount;
    }

    @Override
    void withdraw(double amount) {
        if (amount > balance)
            System.out.println("Low balance");
        else
            balance -= amount;
    }

    void calculateInterest(double time) {
        double interest = (balance * time * interestRate) / 100;

        System.out.println("Interest: Rs." + interest);
    }
}

class Assignment4_Question2 {

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int accno;
        String name, type;
        double interestRate, time, amount;
        System.out.println("Savings account");
        System.out.println("Enter account no: ");
        accno = data.nextInt();
        System.out.println("Enter Name: ");
        name = data.next();
        System.out.println("Enter account type: ");
        type = data.next();
        System.out.println("Enter interest rate: ");
        interestRate = data.nextDouble();
        System.out.println("Enter time (in years): ");
        time = data.nextDouble();
        System.out.println("Deposit amount: ");
        amount = data.nextDouble();
        SavingAccount savingAccount = new SavingAccount();
        savingAccount.setData(accno, name, type, interestRate);
        savingAccount.deposit(amount);
        savingAccount.displayBalance();
        savingAccount.calculateInterest(time);
        System.out.println("Current account");
        System.out.println("Enter account no: ");
        accno = data.nextInt();
        System.out.println("Enter Name: ");
        name = data.next();
        System.out.println("Enter account type: ");
        type = data.next();
        System.out.println("Enter interest rate: ");
        interestRate = data.nextDouble();
        System.out.println("Enter time (in years): ");
        time = data.nextDouble();
        System.out.println("Deposit amount: ");
        amount = data.nextDouble();
        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.setData(accno, name, type, interestRate);
        currentAccount.deposit(amount);
        currentAccount.displayBalance();
        currentAccount.calculateInterest(time);
    }

}

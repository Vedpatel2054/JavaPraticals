public abstract class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public abstract void withdraw(double amount);
}

public class SavingsAccount extends BankAccount {
    private double withdrawalLimit;
    private double withdrawalFee;

    public SavingsAccount(double balance, double withdrawalLimit, double withdrawalFee) {
        super(balance);
        this.withdrawalLimit = withdrawalLimit;
        this.withdrawalFee = withdrawalFee;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > withdrawalLimit) {
            System.out.println("Withdrawal limit exceeded");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            balance -= withdrawalFee;
            System.out.println("Withdrawn: $" + amount + " (fee: $" + withdrawalFee + ")");
        }
    }
}

public class CheckingAccount extends BankAccount {
    private double withdrawalLimit;
    private double withdrawalFee;

    public CheckingAccount(double balance, double withdrawalLimit, double withdrawalFee) {
        super(balance);
        this.withdrawalLimit = withdrawalLimit;
        this.withdrawalFee = withdrawalFee;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > withdrawalLimit) {
            System.out.println("Withdrawal limit exceeded");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        }

        if (balance < 0) {
            balance -= withdrawalFee;
            System.out.println("Withdrawal fee: $" + withdrawalFee);
        }
    }
}

public class 21 {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000, 500, 2);
        savingsAccount.deposit(500);
        savingsAccount.withdraw(600);
        savingsAccount.withdraw(1000);

        CheckingAccount checkingAccount = new CheckingAccount(2000, 1000, 1);
        checkingAccount.deposit(1000);
        checkingAccount.withdraw(1500);
        checkingAccount.withdraw(2000);
    }
}
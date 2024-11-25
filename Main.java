import java.util.Scanner;

interface BankInterface {
    double getBalance();
    double getInterestRate();
}

class BankA implements BankInterface {
    private double balance;

    public BankA(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return 7.0;
    }
}

class BankB implements BankInterface {
    private double balance;

    public BankB(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return 7.4;
    }
}

class BankC implements BankInterface {
    private double balance;

    public BankC(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return 7.9;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter balance for Bank A:");
        double balanceA = scanner.nextDouble();
        System.out.println("Enter balance for Bank B:");
        double balanceB = scanner.nextDouble();
        System.out.println("Enter balance for Bank C:");
        double balanceC = scanner.nextDouble();

        BankA bankA = new BankA(balanceA);
        BankB bankB = new BankB(balanceB);
        BankC bankC = new BankC(balanceC);

        System.out.println("Bank A - Balance: " + bankA.getBalance() + ", Interest Rate: " + bankA.getInterestRate() + "%");
        System.out.println("Bank B - Balance: " + bankB.getBalance() + ", Interest Rate: " + bankB.getInterestRate() + "%");
        System.out.println("Bank C - Balance: " + bankC.getBalance() + ", Interest Rate: " + bankC.getInterestRate() + "%");
    }
}

public class Account {
    private String name;
    private String accountNumber;
    private double balance;
    private double initialbalance;

    // Inisiasi method account
    public Account(String name, String accountNumber, double initialbalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.initialbalance = initialbalance;
        this.balance = balance + initialbalance;
    }

    // Tampilkan saldo awal
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Jumlah saldo tidak valid.");
        }
    }

    // Code penarikan
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Jumlah penarikan tidak valid atau saldo tidak mencukupi.");
            return false;
        }
    }

    // Mengembalikan nilai variable menggunakan method get
    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getinitialbalance() {
        return initialbalance;
    }
}

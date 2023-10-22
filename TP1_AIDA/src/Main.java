import java.util.List;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank();

        // Membuat dan menambahkan akun
        Account account1 = new Account("Aida_SI4601", "102022380444", 100000.0);
        Account account2 = new Account("Zahra", "670202020", 200000);
        Account account3 = new Account("Rayda", "1202200030", 300000);

        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);

        // Melakukan transaksi
        account1.deposit(50000);
        account2.withdraw(20000);

        // Menampilkan saldo pengguna akun
        List<Account> allAccounts = bank.getAllAccounts();
        for (Account account : allAccounts) {
            System.out.println("Saldo Akun " + account.getName() + ": " + account.getinitialbalance());
        }
        // Penarikan dan Setor saldo
        System.out.println("\n");
        System.out.println("Saldo akun " + account1.getName() + " setelah menyetor : " + account1.getBalance());
        System.out.println("Saldo akun " + account2.getName() + " setelah menarik uang : " + account2.getBalance());
        System.out.println("\n");

        // Menghapus akun
        bank.removeAccountName(account2.getName());

        // Tampilkan semua akun
        System.out.println("\nDaftar semua akun dalam bank: ");
        for (Account account : allAccounts) {
            System.out.println("Nama: " + account.getName() + ", Nomor Akun: " + account.getAccountNumber()
                    + ", Saldo: " + account.getBalance());
        }
    }
}

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private ArrayList<Account> accountList = new ArrayList<>();

    // Menambah akun
    public void addAccount(Account account) {
        accountList.add(account);
    }

    // Hapus akun
    public void removeAccountName(String accountName) {
        // Cari akun dengan nama pengguna yang sesuai
        Account accountToRemove = null;
        for (Account account : accountList) {
            if (account.getName().equals(accountName)) {
                accountToRemove = account;
                break;
            }
        }

        // Hapus akun jika ditemukan
        if (accountToRemove != null) {
            accountList.remove(accountToRemove);
            System.out.println("Akun " + accountName + " berhasil dihapus!");
        } else {
            System.out.println("Akun " + accountName + " tidak ditemukan.");
        }
    }

    // Menampilkan semua daftar akun
    public Account getAccount(String accountNumber) {
        for (Account account : accountList) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    // Menampilkan semua daftar akun
    public List<Account> getAllAccounts() {
        return accountList;
    }
}
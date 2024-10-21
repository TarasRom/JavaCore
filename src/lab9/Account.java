package lab9;

public class Account {

    private long balance = 0;

    public long getBalance() {
        return balance;
    }

    public void deposit(long amount) {

        if (amount < 0) {
            throw new IllegalArgumentException("Incorrect sum " + amount);
        }

        if (amount >= 100_000_000L) {
            throw new IllegalArgumentException("Too large amount");
        }

        balance += amount;
    }
}

class AccountDemo {
    public static void main(String[] args) {
        Account account = new Account();
        try {
            account.deposit(-100);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(account.getBalance());
    }
}

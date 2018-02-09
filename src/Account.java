import java.awt.*;
import java.util.ArrayList;

public class Account {

    private int pin;
    private ArrayList<Transaction> transactions = new ArrayList<Transaction>();

    //construct
    public Account(int pin) {
        this.pin = pin;
    }

    public int getBalanceCents() {
        int balance = 0;

        for (Transaction t : transactions) {
            balance += t.getDeltaCents();

        }
        return balance;
    }

    public boolean deposite(int pin, int cents) {
        if (this.pin != pin) {
            return false;
        }

        Transaction t = new Deposit(cents);
        transactions.add(t);
        return true;

    }

    public boolean withdrawal(int pin, int cents) {
        if (this.pin != pin) {
            return false;
        }

        Transaction t = new Withdrawal(cents);
        transactions.add(t);
        return true;

    }


    public static void main(String[] args) {
        Account person1 = new Account(1234);
        person1.deposite(1234,4);
        person1.deposite(1234,5);
        person1.deposite(1234,220);
        person1.withdrawal(1234,20);

        System.out.println(person1.getBalanceCents());

    }

}

public class Deposit implements Transaction {
    private int deltaCents;

    @Override
    public int getDeltaCents() {
        return deltaCents;
    }
    Deposit(int cents) {
        deltaCents = cents;
    }

}

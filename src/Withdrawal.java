public class Withdrawal implements Transaction {
    private int deltaCents;

    public Withdrawal(int cents) {
        deltaCents = - cents;
    }

    @Override
    public int getDeltaCents() {
        return deltaCents;
    }

}

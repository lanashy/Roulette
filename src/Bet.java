public class Bet {

    private final String bet;
    private final int amount;

    public Bet(String bet, int amount) {
        this.bet = bet;
        this.amount = amount;
    }

    public String getBet() {
        return bet;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Your bet is: " + bet +
                ", amount: " + amount +
                '.';
    }
}


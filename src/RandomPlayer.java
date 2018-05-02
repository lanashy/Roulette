import java.util.Random;

public class RandomPlayer extends Player {

    Random random;

    public RandomPlayer() {
        super("Drunk Harry");
        random = new Random();
    }

    @Override
    public Bet doStep(WorldInterface world) {
        Integer bet = random.nextInt(world.getFields().length);
        //always bets 1$
        return new Bet(bet.toString(), 1);
    }
}

public class RedPlayer extends Player {
    private final RandomPlayer adviser = new RandomPlayer();
    private final String preferedBet = "red";

    public RedPlayer() {
        super("Ginger Amanda");
    }

    @Override
    public Bet doStep(WorldInterface world) {
        for (String field : world.getFields()) {
            if (0 == field.compareToIgnoreCase(preferedBet)) {
                return new Bet(field, 1);
            }
        }
        return adviser.doStep(world); //если красных нет, то делает, как ей сказал adviser
    }
}

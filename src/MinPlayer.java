public class MinPlayer extends Player {

    public MinPlayer() {
        super("Small Oliver");
    }

    @Override
    public Bet doStep(WorldInterface world) {
        return new Bet(world.getFields()[0], 1);
    }
}

public class Demo {

    public static void main(String[] args) {
//        int rounds = 5;
//
//        Simulator simulator = new Simulator(new World());
//
//        simulator.join(new RandomPlayer());
//        simulator.join(new RedPlayer());
//        simulator.join(new MinPlayer());
//
//        for (int i = 0; i < rounds; i++) {
//            System.out.printf("Round number: " + i + "\n");
//            simulator.nextRound();
//        }

        int rounds = 5;

        Simulator simulator = new Simulator(new WorldRoulette());

        simulator.join(new RandomPlayer());
        simulator.join(new RedPlayer());
        simulator.join(new MinPlayer());

        for (int i = 0; i < rounds; i++) {
            System.out.println("Round number: " + i + "\n");
            simulator.nextRound();
        }
    }
}

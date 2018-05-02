import java.util.ArrayList;

public class Simulator {
    World world;
    ArrayList<Participant> participants;
    final int MAX_PLAYERS = 5;
    int round;

    public Simulator(World world) {
        this.world = world;
        participants = new ArrayList<>();
        round = 0;
    }

    public void join(Participant player) {
        if (participants.size() >= MAX_PLAYERS) {
            throw new RuntimeException("Too many players in the game.\n");
        }
        if (player != null && participants.indexOf(player) == -1) {
            participants.add(player);
        }
    }

    public void nextRound() {
        for (int i = 0; i < participants.size(); i++) {
            Participant player = participants.get(i);
            Bet bet = player.doStep(world);
            System.out.println("Round " + round + " player #" + i
                    + " (" + player + ") bet: " + bet + "\n");
        }
        round++;
    }
}

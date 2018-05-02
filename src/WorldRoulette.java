public class WorldRoulette extends World {
    @Override
    protected String[] initFields() {
        String[] fields = new String[36 + 1 + 4];

        fields[0] = "even";
        fields[1] = "odd";
        fields[2] = "red";
        fields[3] = "black";

        for (int i = 0; i <= 36; i++) {
            fields[i + 4] = Integer.toString(i);
        }
        return fields;
    }
}

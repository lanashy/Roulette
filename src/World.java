public abstract class World implements WorldInterface {
    private final int MIN_NUMBER = 1;
    private final int MAX_NUMBER = 36;

    private final String[] fields;

    public World() {
        fields = initFields();
    }

    protected abstract String[] initFields();

    @Override
    public Bet doStep(Participant player) {
        return player.doStep(this);
    }

    @Override
    public String[] getFields() {
        String[] readFields = new String[fields.length];
        System.arraycopy(fields, 0, readFields, 0, fields.length);
        return readFields;
    }

    public int getMIN_NUMBER() {
        return MIN_NUMBER;
    }

    public int getMAX_NUMBER() {
        return MAX_NUMBER;
    }


}

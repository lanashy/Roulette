public class WorldNumeric extends World {

    @Override
    protected String[] initFields() {
        String[] fields = new String[10];

        for (int i = 0; i < fields.length; i++) {
            fields[i] = Integer.toString(i);
        }

        return fields;
    }
}

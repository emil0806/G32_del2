package game;

public class Field {

    private String name;
    private String description;
    private int value;

    public Field(String name, String description, int value) {
        this.name = name;
        this.description = description;
        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public int getValue() {
        return this.value;
    }
}

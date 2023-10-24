package game;

public class Field {

    //Attributes for field
    private String name;
    private String description;
    private int value;

    // Constructor to initialize Field properties
    public Field(String name, String description, int value) {
        this.name = name;
        this.description = description;
        this.value = value;
    }

    // Returns the name property
    public String getName() {
        return this.name;
    }

    // Returns the description property
    public String getDescription() {
        return this.description;
    }

    //Returns the value property
    public int getValue() {
        return this.value;
    }
}

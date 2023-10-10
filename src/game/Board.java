package game;

public class Board {

    private Field[] fields = new Field[12];

    public Board() {
        fields[0] = new Field("Tower", "You found Tower seven", 250);
        fields[1] = new Field("Crater", "You fell into the Crater of Doom", -100);
        fields[2] = new Field("Palace gates", "You found the gates to the migthy Palace", 100);
        fields[3] = new Field("Cold desert", "uhhh, you are frezzing in the cold", -20);
        fields[4] = new Field("Walled city", "You moved into the Walled city, you are safe", 180);
        fields[5] = new Field("Monastery", "You fell a sleep in a church", 0);
        fields[6] = new Field("Black cave", "You got bit by a bat, and starts felling sick", -70);
        fields[7] = new Field("Huts in the mountain", "You found a shelter for the night", 60);
        fields[8] = new Field("The Werewall", "There is a smell of werewolf, you run so fast, you get a extra turn",
                -80);
        fields[9] = new Field("The pit", "Ohhh no, not the pit again", -50);
        fields[10] = new Field("Goldmine", "Ouch, you fell over a rock, a rock of gold!!!", 650);
    }

    public Field getField(int sum) {
        return fields[sum];
    }
}

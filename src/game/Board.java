package game;

public class Board {
    
    private Field[] listOfField = new Field[] {
        new Field ("Tower", "You found Tower seven", 250), new Field ("Crater", "You fell into the Crater of Doom", -100), new Field ("Palace gates", "You found the gates to the migthy Palace",100),
    new Field ("Cold desert", "uhhh, you are frezzing in the cold", -20), new Field ("Walled city", "You moved into the Walled city, you are safe", 180), new Field ("Monastery", "You fell a sleep in a church", 0),
 new Field ("Black cave", "You got bit by a bat, and starts felling sick", -70), new Field ("Huts in the mountain", "You found a shelter for the night", 60), new Field ("The Werewall", "There is a smell of werewolf, you run so fast, you get a extra turn", -80),
    new Field ("The pit", "Ohhh no, not the pit again",-50), new Field ("Goldmine", "Ouch, you fell over a rock, a rock of gold!!!", +650)
    };
    


    public Field getField(int sum) {
        Field field = listOfField[0];

        return field;
    }
}

package game;

public class Board {

    private Field[] fields = new Field[11];

    //Text displayed when player lands on a certain field
    public Board() {
        fields[0] = new Field("Tower", "You found Tower seven. The government pays 250 for all your help.", 250);
        fields[1] = new Field("Crater", "You fell into the Crater of Doom. You need to pay 100 to respawn.", -100);
        fields[2] = new Field("Palace gates",
                "You found the gates to the migthy Palace. They pay you 100 to keep it a secret.", 100);
        fields[3] = new Field("Cold desert", "Uhhh, you are frezzing in the cold. You pay 20 bucks for a jacket.", -20);
        fields[4] = new Field("Walled city",
                "You moved into the Walled city, you are safe. Salary is good there, you earn 180.", 180);
        fields[5] = new Field("Monastery", "You fell a sleep in a church. God let you stay for free.", 0);
        fields[6] = new Field("Black cave",
                "You got bit by a bat, and starts felling sick. The doctor needs 70 bucks to heal you.", -70);
        fields[7] = new Field("Huts in the mountain",
                "You found a shelter for the night, and somebody left 60 bucks for you.", 60);
        fields[8] = new Field("The Werewall",
                "There is a smell of werewolf, you run so fast, you get a extra turn. But unfortunately you drop 80 bucks in the rush.",
                -80);
        fields[9] = new Field("The pit", "Ohhh no, not the pit again. Help cost 50 bucks.", -50);
        fields[10] = new Field("Goldmine",
                "Ouch, you fell over a rock, a rock of gold!!! The pawnshop pay 650 for the gold. ", 650);
    }

    //Returns element from array
    public Field getField(int sum) {
        return fields[sum];
    }
}

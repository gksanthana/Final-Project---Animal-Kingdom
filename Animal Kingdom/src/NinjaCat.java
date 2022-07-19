package animalKingdom;

import java.awt.Color;
import java.util.Random;

public class NinjaCat extends Critter {
    //declare the properties here

    //constructor
    public NinjaCat() {

    }
    //display number of infections
    public String toString() {
        return "NJ";
    }
    //color is based on how many infections it has done
    public Color getColor() {
        Random random = new Random();
        Color color;
        color = new Color(random.nextInt(0xFFFFFF));
        return color;
    }
    //same as giant
    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.EMPTY) {
            return Action.HOP;
        }
        return Action.RIGHT;
    }
}

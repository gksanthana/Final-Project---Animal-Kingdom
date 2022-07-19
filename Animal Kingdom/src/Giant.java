package animalKingdom;

import java.awt.Color;

public class Giant extends Critter {
    //declare the properties here

    private String s;
    private int step;

    //constructor
    public Giant() {

    }

    public final Color getColor() {
        return Color.GRAY;
    }

    /*"fee" for 6 moves, then "fie" for 6 moves, then "foe" for 6 moves,
        then "fum" for 6 moves, then repeat.*/
    public String toString() {
        if (step >= 0 && step < 6) {
            s = "fee";
        } else if (step > 6 && step <= 12) {
            s = "fie";
        } else if (step > 12 && step <= 18) {
            s = "foe";
        } else if (step > 18 && step <= 24) {
            s = "fum";
        }
        if (step > 24) {
            this.step = 0;
        }
        return s;

    }
    /*	always infect if an enemy is in front, otherwise hop if possible,
otherwise turn right.*/
    public Action getMove(CritterInfo info) {
        step++;
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.EMPTY) {
            return Action.HOP;
        }
        return Action.RIGHT; }

}

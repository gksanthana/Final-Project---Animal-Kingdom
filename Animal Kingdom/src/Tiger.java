package animalKingdom;

import java.awt.Color;
import java.util.Random;

public class Tiger extends Critter {
    private int step;
    private Random random = new Random();
    private Color[] color = { Color.RED, Color.GREEN, Color.BLUE };
    private Color c = color[random.nextInt(3)];

    public Tiger() {
    }
    /*Randomly picks one of three colors (Color.RED, Color.GREEN, Color.BLUE)
    and uses that color for three moves, then randomly picks one of those colors
    again for the next three moves then randomly picks another one of those
    colors for the next three moves, and so on.*/
    public Color getColor() {
        if (step % 3 == 0) {
            c = color[random.nextInt(3)];
            return c;
        }
        return this.c;
    }

    //"TGR"
    public final String toString() {
        return "TGR";
    }
    /*always infect if an enemy is in front, otherwise if a wall is in front or
    to the right, then turn left, otherwise if a fellow Tiger is in front, then
    turn right, otherwise hop.*/
    public Action getMove(CritterInfo info) {
        step++;
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL) {
            return Action.LEFT;
        } else if (info.getFront() == Neighbor.SAME) {
            return Action.RIGHT;
        }
        return Action.HOP;
    }
}

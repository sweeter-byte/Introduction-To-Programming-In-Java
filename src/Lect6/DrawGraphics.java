package Lect6;

import java.awt.Graphics;
import java.awt.Color;
import java.util.ArrayList;

public class DrawGraphics {
    private ArrayList<Mover> movers = new ArrayList<>();

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        // Bouncing rectangle
        Rectangle rect1 = new Rectangle(20, 30, Color.RED);
        Bouncer bounce1 = new Bouncer(100, 170, rect1);
        bounce1.setMovementVector(3, 1);
        movers.add(bounce1);

        // Bouncing oval
        Oval oval1 = new Oval(25, 25, Color.BLUE);
        Bouncer bounce2 = new Bouncer(50, 50, oval1);
        bounce2.setMovementVector(2, 2);
        movers.add(bounce2);

        // Straight rectangle
        Rectangle rect2 = new Rectangle(15, 20, Color.GREEN);
        StraightMover move1 = new StraightMover(10, 10, rect2);
        move1.setMovementVector(1, 2);
        movers.add(move1);

        // Straight oval
        Oval oval2 = new Oval(30, 15, Color.ORANGE);
        StraightMover move2 = new StraightMover(150, 200, oval2);
        move2.setMovementVector(-2, 1);
        movers.add(move2);
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {
        for (Mover mover : movers) {
            mover.draw(surface);
        }
    }
}

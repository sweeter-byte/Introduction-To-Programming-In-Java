package Lect6;

import java.awt.Graphics;

public class StraightMover implements Mover {
    private int x;
    private int y;
    private int xDirection;
    private int yDirection;
    private Sprite sprite;

    public StraightMover(int startX, int startY, Sprite sprite) {
        x = startX;
        y = startY;
        this.sprite = sprite;
    }

    public void setMovementVector(int xIncrement, int yIncrement) {
        xDirection = xIncrement;
        yDirection = yIncrement;
    }

    @Override
    public void draw(Graphics graphics) {
        sprite.draw(graphics, x, y);
        x += xDirection;
        y += yDirection;
    }
}

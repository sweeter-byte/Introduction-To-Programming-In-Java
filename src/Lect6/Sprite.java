package Lect6;

import java.awt.Graphics;

/** Drawable interface for shapes */
public interface Sprite {
    void draw(Graphics surface, int leftX, int topY);
    int getWidth();
    int getHeight();
}

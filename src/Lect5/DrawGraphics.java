package Lect5;

import java.awt.Color; 
import java.awt.Graphics; 
import java.util.ArrayList;

public class DrawGraphics { 
    ArrayList<BouncingBox> boxes; // 使用ArrayList存储多个BouncingBox
    
    /** Initializes this class for drawing. */ 
    public DrawGraphics() { 
        boxes = new ArrayList<BouncingBox>();
        
        // 添加至少三个方块，移动方向各不相同
        BouncingBox box1 = new BouncingBox(200, 50, Color.RED);
        box1.setMovementVector(1, 0); // 向右缓慢移动
        
        BouncingBox box2 = new BouncingBox(100, 100, Color.BLUE);
        box2.setMovementVector(0, -2); // 向上快速移动
        
        BouncingBox box3 = new BouncingBox(50, 200, Color.GREEN);
        box3.setMovementVector(2, 1); // 向右下方向移动
        
        // 将方块添加到ArrayList中
        boxes.add(box1);
        boxes.add(box2);
        boxes.add(box3);
    } 
    
    /** Draw the contents of the window on surface. Called 20 times per second. */ 
    public void draw(Graphics surface) { 
        surface.drawLine(50, 50, 150, 150); 
        surface.drawRect(150, 150, 50, 50);
        surface.drawRoundRect(150, 150, 75, 75, 100, 100);

        // fillPolygon()
        int[] xPoints = new int[20];
        int[] yPoints = new int[20];
        // 绘制一个正20边形
        for(int i = 0; i < xPoints.length; i++) {
            double angle = 2 * Math.PI * i / 20;
            xPoints[i] = (int)(100 + 50 * Math.cos(angle));  // 圆心(100,100)，半径50
            yPoints[i] = (int)(100 + 50 * Math.sin(angle));
        }
        surface.fillPolygon(xPoints, yPoints, xPoints.length);
        
        // 使用循环绘制所有方块
        for (BouncingBox box : boxes) {
            box.draw(surface);
        }
    } 
}
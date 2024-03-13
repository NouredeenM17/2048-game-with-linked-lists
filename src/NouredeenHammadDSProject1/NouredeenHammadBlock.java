package NouredeenHammadDSProject1;

import java.awt.Color;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author Nouredeen HAMMAD
 */
public class NouredeenHammadBlock {

    private int value;
    private Rectangle2D.Double rectangle;
    private Color color;
    private double x, y;
    private double length = 84;

    public NouredeenHammadBlock(double x, double y, int value) {
        this.value = value;
        this.x = x;
        this.y = y;
        this.rectangle = new Rectangle2D.Double(x, y, length, length);
        this.color = initColor();
    }

    //Sets the block color according to its value
    public Color initColor() {
        switch ((int) value) {
            case 2:
                return Color.YELLOW;
            case 4:
                return Color.ORANGE;
            case 8:
                return Color.RED;
            case 16:
                return Color.MAGENTA;
            case 32:
                return Color.BLUE;
            case 64:
                return Color.CYAN;
            case 128:
                return Color.PINK;
            case 256:
                return Color.GREEN;
            default:
                return Color.BLACK;
        }
    }

    public double getX() {
        return x;
    }

    //Sets X coordinate and refreshes the Rectangle2D.Double object
    public void setX(double x) {
        this.x = x;
        this.rectangle = new Rectangle2D.Double(x, y, length, length);
    }

    public double getY() {
        return y;
    }

    //Sets Y coordinate and refreshes the Rectangle2D.Double object
    public void setY(double y) {
        this.y = y;
        this.rectangle = new Rectangle2D.Double(x, y, length, length);
    }
    
    public Rectangle2D.Double getRectangle() {
        return rectangle;
    }

    public void setRectangle(Rectangle2D.Double rect) {
        this.rectangle = rect;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}

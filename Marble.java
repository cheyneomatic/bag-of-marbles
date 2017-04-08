import java.awt.*;

/**
 * Created by cheyne on 4/6/17.
 */
public class Marble {
    // size in millimeters (http://www.glassmarbles.com/size.htm)
    private int size;
    private String style;
    private Color color;
    private boolean inBag;

    // constructor
    Marble(int _size, Color _color, String _style) {
        size = _size;
        color = _color;
        style = _style;
        inBag = true;

    }

    public String toString() {
        return String.format("%dmm-sized marble, colored with %s, in the style of %s", size, color, style);
    }

    public int getSize() {
        return size;
    }

    public String getStyle() {
        return style;
    }

    public Color getColor() {
        return color;
    }
}

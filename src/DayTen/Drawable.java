package DayTen;

// TODO: Interface for drawing shapes
public interface Drawable {
    void draw();
}

// ! ISP Shape and Drawable are separate interfaces. Not all shapes  need to be drawable, so we avoid forcing clients to implement unused methods.


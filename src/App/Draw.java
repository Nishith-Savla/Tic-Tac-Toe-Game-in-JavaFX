package App;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * @author Nishith
 */
public class Draw
{

    public GraphicsContext draw_basic_skeleton(GraphicsContext gc)
    {
        gc.setLineWidth(5);
        gc.setStroke(Color.WHITE);
        gc.strokeLine(50 + 15 + 70 + 15/*X1*/, 50 + 15/*Y1*/, 50 + 15 + 70 + 15/*X2*/, 50 + 15 + 70 + 15 + 70 + 15 + 70 + 15 + 15 + 15 + 15/*Y2*/); // Vertical left
        gc.strokeLine(50 + 15 + 70 + 15 + 70 + 15 + 15/*X1*/, 50 + 15/*Y1*/, 50 + 15 + 70 + 15 + 70 + 15 + 15/*X2*/, 50 + 15 + 70 + 15 + 70 + 15 + 70 + 15 + 15 + 15 + 15/*Y2*/); // Vertical right
        gc.strokeLine(50/*X1*/, 50 + 15 + 70 + 15 + 15/*Y1*/, 50 + 15 + 70 + 15 + 70 + 15 + 70 + 15 + 15 + 15/*X2*/, 50 + 15 + 70 + 15 + 15/*Y2*/); // Horizontal up
        gc.strokeLine(50/*X1*/, 50 + 15 + 70 + 15 + 70 + 15 + 15 + 15/*Y1*/, 50 + 15 + 70 + 15 + 70 + 15 + 70 + 15 + 15 + 15/*X2*/, 50 + 15 + 70 + 15 + 70 + 15 + 15 + 15/*Y2*/); // Horizontal right
        return gc;
    }

    /* Some cheat-sheets (co-ordinates) for methods 
     *
     * -- 1st row
     * 50+15, 50+15
     * 50+15+70+30, 50+15
     * 50+15+70+30+70+30, 50+15
     *
     * -- 2nd row
     * 50+15, 50+15+70+30
     * 50+15+70+30, 50+15+70+30
     * 50+15+70+30+70+30, 50+15+70+30
     *
     * -- 3rd row
     * 50+15, 50+15+70+30+70+30
     * 50+15+70+30, 50+15+70+30+70+30
     * 50+15+70+30+70+30, 50+15+70+30+70+30
     */
    public GraphicsContext draw_cross(GraphicsContext gc, double startX, double startY)
    {
        gc.setLineWidth(7);
        gc.strokeLine(startX, startY, startX + 70, startY + 70);
        gc.strokeLine(startX + 70, startY, startX, startY + 70);

        return gc;
    }

    public GraphicsContext draw_circle(GraphicsContext gc, double startX, double startY)
    {
        gc.setLineWidth(7);
        gc.strokeOval(startX, startY, 70, 70);
        return gc;
    }

}

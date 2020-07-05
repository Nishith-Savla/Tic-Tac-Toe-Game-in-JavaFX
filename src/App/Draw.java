package App;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Draw
{

    /**
     * Draws the main 4 lines
     *
     * @param gc Graphic Context of the Canvas
     * @return gc Same Graphic context received as parameter after drawing the
     * lines
     *
     */
    public static GraphicsContext draw_basic_skeleton(GraphicsContext gc)
    {
        gc.setLineWidth(5);
        gc.setStroke(Color.WHITE);
        gc.strokeLine(50 + 15 + 70 + 15/*X1*/, 50 + 15/*Y1*/, 50 + 15 + 70 + 15/*X2*/, 50 + 15 + 70 + 15 + 70 + 15 + 70 + 15 + 15 + 15 + 15/*Y2*/); // Vertical left
        gc.strokeLine(50 + 15 + 70 + 15 + 70 + 15 + 15/*X1*/, 50 + 15/*Y1*/, 50 + 15 + 70 + 15 + 70 + 15 + 15/*X2*/, 50 + 15 + 70 + 15 + 70 + 15 + 70 + 15 + 15 + 15 + 15/*Y2*/); // Vertical right
        gc.strokeLine(50/*X1*/, 50 + 15 + 70 + 15 + 15/*Y1*/, 50 + 15 + 70 + 15 + 70 + 15 + 70 + 15 + 15 + 15/*X2*/, 50 + 15 + 70 + 15 + 15/*Y2*/); // Horizontal up
        gc.strokeLine(50/*X1*/, 50 + 15 + 70 + 15 + 70 + 15 + 15 + 15/*Y1*/, 50 + 15 + 70 + 15 + 70 + 15 + 70 + 15 + 15 + 15/*X2*/, 50 + 15 + 70 + 15 + 70 + 15 + 15 + 15/*Y2*/); // Horizontal right
        return gc;
    }

    /**
     * Draws a cross from the starting points
     *
     * @param gc Graphic Context of the Canvas
     * @param startX X-coordinate of the point to start drawing from
     * @param startY Y-coordinate of the point to start drawing from
     * @return Same Graphic context received as parameter after drawing the
     * cross
     */
    public static GraphicsContext draw_cross(GraphicsContext gc, int startX, int startY)
    {
        gc.setLineWidth(7);
        gc.strokeLine(startX, startY, startX + 70, startY + 70);
        gc.strokeLine(startX + 70, startY, startX, startY + 70);
        return gc;
    }

    /**
     * Draws a circle (oval) from the starting points
     *
     * @param gc Graphic Context of the Canvas
     * @param startX X-coordinate of the point to start drawing from
     * @param startY Y-coordinate of the point to start drawing from
     * @return Same Graphic context received as parameter after drawing the
     * circle
     */
    public static GraphicsContext draw_circle(GraphicsContext gc, int startX, int startY)
    {
        gc.setLineWidth(7);
        gc.strokeOval(startX, startY, 70, 70);
        return gc;
    }

    /**
     * Draws a line from the starting points
     *
     * @param gc Graphic Context of the Canvas
     * @param startX X-coordinate of the point to start drawing from
     * @param startY Y-coordinate of the point to start drawing from
     * @param endX
     * @param endY
     * @return Same Graphic context received as parameter after drawing the
     * circle
     */
    public static GraphicsContext draw_winning_line(GraphicsContext gc, int startX, int startY, int endX, int endY)
    {
        gc.setLineWidth(5);
        gc.setStroke(Color.YELLOW);
        gc.strokeLine(startX, startY, endX, endY);
        return gc;
    }
    
}

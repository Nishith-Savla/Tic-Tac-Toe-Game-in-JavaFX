package App;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;

/**
 * @author Nishith
 */
public class Draw
{
    Pane pane = new Pane();
    
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
    
    protected GraphicsContext draw_cross(GraphicsContext gc, double startX, double startY)
    {
        gc.setLineWidth(7.5);
        gc.strokeLine(startX, startY, startX+70, startY+70);
        gc.strokeLine(startX+70, startY, startX, startY+70);
        
        return gc;
    }
    
    protected GraphicsContext draw_circle(GraphicsContext gc, double startX, double startY)
    {
        gc.strokeOval(startX, startY, 70, 70);
        return gc;
    }
    
    
}

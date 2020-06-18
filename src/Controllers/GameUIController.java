package Controllers;

import App.Draw;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 * @author Nishith
 */
public class GameUIController implements Initializable
{
    Draw draw = new Draw();
    GraphicsContext gc;

    @FXML
    private AnchorPane aPane;

    @FXML
    private Canvas canvas;
    
    /*
    public GraphicsContext draw_try(GraphicsContext gc)
    {
        gc=draw.draw_circle(gc, 50+15, 50+15+15);
        gc=draw.draw_circle(gc, 50+15, 50+15+70+30+15);
        gc=draw.draw_circle(gc, 50+15, 50+15+70+30+70+30+15);
        gc=draw.draw_circle(gc, 50+15+70+30, 50+15+15);
        gc=draw.draw_circle(gc, 50+15+70+30, 50+15+70+30+15);
        gc=draw.draw_circle(gc, 50+15+70+30, 50+15+70+30+70+30+15);
        gc=draw.draw_circle(gc, 50+15+70+30+70+30, 50+15+15);
        gc=draw.draw_circle(gc, 50+15+70+30+70+30, 50+15+70+30+15);
        gc=draw.draw_circle(gc, 50+15+70+30+70+30, 50+15+70+30+70+30+15);
        
        gc=draw.draw_cross(gc, 50+15, 50+15+15);
        gc=draw.draw_cross(gc, 50+15, 50+15+70+30+15);
        gc=draw.draw_cross(gc, 50+15, 50+15+70+30+70+30+15);
        gc=draw.draw_cross(gc, 50+15+70+30, 50+15+15);
        gc=draw.draw_cross(gc, 50+15+70+30, 50+15+70+30+15);
        gc=draw.draw_cross(gc, 50+15+70+30, 50+15+70+30+70+30+15);
        gc=draw.draw_cross(gc, 50+15+70+30+70+30, 50+15+15);
        gc=draw.draw_cross(gc, 50+15+70+30+70+30, 50+15+70+30+15);
        gc=draw.draw_cross(gc, 50+15+70+30+70+30, 50+15+70+30+70+30+15);
        return gc;
    }
    */

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        gc = canvas.getGraphicsContext2D();
        gc=draw.draw_basic_skeleton(gc);
        //gc=draw_try(gc);
    }

}

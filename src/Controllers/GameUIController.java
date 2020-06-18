package Controllers;

import App.Draw;
import App.Players;
import App.SymbolsEnum;
import com.jfoenix.controls.JFXRadioButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 * @author Nishith
 */
public class GameUIController implements Initializable
{
    Draw draw = new Draw();
    GraphicsContext gc;
    Players player1, player2;

    @FXML
    private AnchorPane aPane;

    @FXML
    private Canvas canvas;

    @FXML
    private JFXRadioButton X1;

    @FXML
    private JFXRadioButton O1;

    @FXML
    private ToggleGroup GroupP1;

    @FXML
    private JFXRadioButton X2;

    @FXML
    private JFXRadioButton O2;

    @FXML
    private ToggleGroup GroupP2;

    @FXML
    void playerSymbol(ActionEvent event) {
        if (X1.isSelected()) {
            O2.setSelected(true);
            player1.symbol = SymbolsEnum.CROSS;
            player2.symbol = SymbolsEnum.ROUND;
        } else if (O1.isSelected()) {
            X2.setSelected(true);
            player1.symbol = SymbolsEnum.ROUND;
            player2.symbol = SymbolsEnum.CROSS;
        } else if (X2.isSelected()) {
            O1.setSelected(true);
            player1.symbol = SymbolsEnum.ROUND;
            player2.symbol = SymbolsEnum.CROSS;
        } else {
            X1.setSelected(true);
            player1.symbol = SymbolsEnum.CROSS;
            player2.symbol = SymbolsEnum.ROUND;
        } 
        System.out.println(player1.symbol);
        System.out.println(player2.symbol);
    }

    
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
        player1 = new Players();
        player2 = new Players();
        gc = canvas.getGraphicsContext2D();
        gc=draw.draw_basic_skeleton(gc);
        //gc=draw_try(gc);
    }

}

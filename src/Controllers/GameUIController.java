package Controllers;

import App.Draw;
import App.Player;
import App.SymbolsEnum;
import App.Turn;
import com.jfoenix.controls.JFXButton;
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
 *
 * @author Nishith
 */
public class GameUIController implements Initializable
{

    GraphicsContext gc;
    Player player1;
    Player player2;

    @FXML
    private AnchorPane aPane;

    @FXML
    private Canvas canvas;

    @FXML
    private JFXButton b1;

    @FXML
    private JFXButton b2;

    @FXML
    private JFXButton b3;

    @FXML
    private JFXButton b4;

    @FXML
    private JFXButton b5;

    @FXML
    private JFXButton b6;

    @FXML
    private JFXButton b7;

    @FXML
    private JFXButton b8;

    @FXML
    private JFXButton b9;

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
    void playerSymbol(ActionEvent event)
    {
        b1.setDisable(false);
        b2.setDisable(false);
        b3.setDisable(false);
        b4.setDisable(false);
        b5.setDisable(false);
        b6.setDisable(false);
        b7.setDisable(false);
        b8.setDisable(false);
        b9.setDisable(false);
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

    @FXML
    void eventb1(ActionEvent event)
    {
        draw(50+15, 50+15+15);
        ChangeTurn();
        b1.setDisable(true);
    }

    @FXML
    void eventb2(ActionEvent event)
    {
        draw(50+15+70+30, 50+15+15);
        ChangeTurn();
        b2.setDisable(true);
    }

    @FXML
    void eventb3(ActionEvent event)
    {
        draw(50+15+70+30+70+30, 50+15+15);
        ChangeTurn();
        b3.setDisable(true);
    }

    @FXML
    void eventb4(ActionEvent event)
    {
        draw(50+15, 50+15+70+30+15);
        ChangeTurn();
        b4.setDisable(true);
    }

    @FXML
    void eventb5(ActionEvent event)
    {
        draw(50+15+70+30, 50+15+70+30+15);
        ChangeTurn();
        b5.setDisable(true);
    }

    @FXML
    void eventb6(ActionEvent event)
    {
        draw(50+15+70+30+70+30, 50+15+70+30+15);
        ChangeTurn();
        b6.setDisable(true);
    }

    @FXML
    void eventb7(ActionEvent event)
    {
        draw(50+15, 50+15+70+30+70+30+15);
        ChangeTurn();
        b7.setDisable(true);
    }

    @FXML
    void eventb8(ActionEvent event)
    {
        draw(50+15+70+30, 50+15+70+30+70+30+15);
        ChangeTurn();
        b8.setDisable(true);
    }

    @FXML
    void eventb9(ActionEvent event)
    {
        draw(50+15+70+30+70+30, 50+15+70+30+70+30+15);
        ChangeTurn();
        b9.setDisable(true);
    }

    
    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        player1 = new Player();
        player2 = new Player();
        Turn.setTurn(player1);
        gc = canvas.getGraphicsContext2D();
        gc = Draw.draw_basic_skeleton(gc);
        //gc=draw_try(gc);
    }

    private void ChangeTurn()
    {
        if (Turn.getTurn() == player1) {
            Turn.setTurn(player2);
        } else {
            Turn.setTurn(player1);
        }
    }
    
    private void draw(double startX, double startY)
    {
        if (Turn.getTurn() == player1) {
            if (player1.symbol == SymbolsEnum.CROSS) {
                Draw.draw_cross(gc, startX, startY);
            } else {
                Draw.draw_circle(gc, startX, startY);
            }
        } else if(Turn.getTurn() == player2){
            if (player2.symbol == SymbolsEnum.CROSS) {
                Draw.draw_cross(gc, startX, startY);
            } else {
                Draw.draw_circle(gc, startX, startY);
            }
        }
    }
}

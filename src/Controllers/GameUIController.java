package Controllers;

import App.Draw;
import App.Main;
import App.Player;
import App.Result;
import App.SymbolsEnum;
import App.Turn;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Nishith
 */
public class GameUIController extends Turn implements Initializable // Making 'Turn' Class parent to avoid repeated reference to class for accessing its static fields
{

    GraphicsContext gc;
    Player player1;
    Player player2;
    boolean win; // To check has any player won

    @FXML
    private AnchorPane aPane;

    @FXML
    private Canvas canvas;

    @FXML // 9 boxes to draw 
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

    // JFXTextFields for players
    @FXML
    private JFXTextField p1;
    @FXML
    private JFXTextField p2;

    // Labels for underline
    @FXML
    private Label u1;

    @FXML
    private Label u2;

    // JFXRadiobuttons for symbol choice of player1
    @FXML
    private JFXRadioButton X1;
    @FXML
    private JFXRadioButton O1;

    @FXML
    private ToggleGroup GroupP1; // ToggleGroup for player1 radiobuttons

    // JFXRadiobuttons for symbol choice of player2
    @FXML
    private JFXRadioButton X2;
    @FXML
    private JFXRadioButton O2;

    @FXML
    private ToggleGroup GroupP2; // ToggleGroup for player2 radiobuttons

    @FXML // Reset or NewGame button
    private JFXButton reset;

    /**
     * The radio button event ti=o select the clicked and also to select the
     * opposite for other player (Player 2 here)
     *
     * @param event OnClick Action Event
     */
    @FXML
    void player1Symbol(ActionEvent event)
    {
        setAllDisable(false);
        if (X1.isSelected()) {
            O2.setSelected(true);
            // Setting Symbols for players
            player1.setSymbol(SymbolsEnum.CROSS);
            player2.setSymbol(SymbolsEnum.ROUND);
        } else if (O1.isSelected()) {
            X2.setSelected(true);
            // Setting Symbols for players
            player1.setSymbol(SymbolsEnum.ROUND);
            player2.setSymbol(SymbolsEnum.CROSS);
        }
        // Set initial turn for player with symbol CROSS
        if (player1.getSymbol() == SymbolsEnum.CROSS) {
            setTurn(player1);
            // Setting underlines visible or invisible acc to player turn
            u1.setVisible(true);
            u2.setVisible(false);
        } else {
            setTurn(player2);
            u2.setVisible(true);
            u1.setVisible(false);
        }
    }

    /**
     * The radio button event to select the clicked and also to select the
     * opposite for other player (Player 1 here)
     *
     * @param event OnClick Action Event
     */
    @FXML
    void player2Symbol(ActionEvent event)
    {
        setAllDisable(false);
        if (X2.isSelected()) {
            O1.setSelected(true);
            // Setting Symbols for players
            player1.setSymbol(SymbolsEnum.CROSS);
            player2.setSymbol(SymbolsEnum.ROUND);
        } else if (O2.isSelected()) {
            X1.setSelected(true);
            // Setting Symbols for players
            player1.setSymbol(SymbolsEnum.ROUND);
            player2.setSymbol(SymbolsEnum.CROSS);
        }
        // Set initial turn for player with symbol CROSS
        if (player1.getSymbol() == SymbolsEnum.CROSS) {
            setTurn(player1);
            // Setting underlines visible or invisible acc to player turn
            u1.setVisible(true);
            u2.setVisible(false);
        } else {
            setTurn(player2);
            u2.setVisible(true);
            u1.setVisible(false);
        }
    }

    @FXML
    void resetButton(ActionEvent event)
    {
        ((Stage) reset.getScene().getWindow()).close(); // Close the recent window so that there remains only one window
        // Running a new instance of the start method
        try {
            new Main().start(new Stage());
            Result.clearMoves();
        } catch (IOException ex) {
            ex.getMessage();
        }
    }

    /*
     * --------------- This is same for all 9 buttonEvents ---------------
     *
     * win = Result.add(player1, player2, 'boxnumber'); -->> Add the number of box to the moves of the respective player and check if there is a win 
     * draw(50 + 15, 50 + 15 + 15); -->> Draw and if win is false show alert -> this is included in draw function
     * ChangeTurn(); -->> This will happen only if win is false 
     * buttonNumber.setDisable(true); -->> Disable the button for further overwriting
     */
    @FXML
    void eventb1(ActionEvent event)
    {
        disableChoices(true);
        win = Result.add(player1, player2, 1);
        draw(50 + 15, 50 + 15 + 15);
        ChangeTurn();
        b1.setDisable(true);
    }

    @FXML
    void eventb2(ActionEvent event)
    {
        disableChoices(true);
        win = Result.add(player1, player2, 2);
        draw(50 + 15 + 70 + 30, 50 + 15 + 15);
        ChangeTurn();
        b2.setDisable(true);
    }

    @FXML
    void eventb3(ActionEvent event)
    {
        disableChoices(true);
        win = Result.add(player1, player2, 3);
        draw(50 + 15 + 70 + 30 + 70 + 30, 50 + 15 + 15);
        ChangeTurn();
        b3.setDisable(true);
    }

    @FXML
    void eventb4(ActionEvent event)
    {
        disableChoices(true);
        win = Result.add(player1, player2, 4);
        draw(50 + 15, 50 + 15 + 70 + 30 + 15);
        ChangeTurn();
        b4.setDisable(true);
    }

    @FXML
    void eventb5(ActionEvent event)
    {
        disableChoices(true);
        win = Result.add(player1, player2, 5);
        draw(50 + 15 + 70 + 30, 50 + 15 + 70 + 30 + 15);
        ChangeTurn();
        b5.setDisable(true);
    }

    @FXML
    void eventb6(ActionEvent event)
    {
        disableChoices(true);
        win = Result.add(player1, player2, 6);
        draw(50 + 15 + 70 + 30 + 70 + 30, 50 + 15 + 70 + 30 + 15);
        ChangeTurn();
        b6.setDisable(true);
    }

    @FXML
    void eventb7(ActionEvent event)
    {
        disableChoices(true);
        win = Result.add(player1, player2, 7);
        draw(50 + 15, 50 + 15 + 70 + 30 + 70 + 30 + 15);
        ChangeTurn();
        b7.setDisable(true);
    }

    @FXML
    void eventb8(ActionEvent event)
    {
        disableChoices(true);
        win = Result.add(player1, player2, 8);
        draw(50 + 15 + 70 + 30, 50 + 15 + 70 + 30 + 70 + 30 + 15);
        ChangeTurn();
        b8.setDisable(true);
    }

    @FXML
    void eventb9(ActionEvent event)
    {
        disableChoices(true);
        win = Result.add(player1, player2, 9);
        draw(50 + 15 + 70 + 30 + 70 + 30, 50 + 15 + 70 + 30 + 70 + 30 + 15);
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
        gc = canvas.getGraphicsContext2D();
        gc = Draw.draw_basic_skeleton(gc);
    }

    /**
     * Changes the turn to the other player
     */
    private void ChangeTurn()
    {
        if (getTurn() == player1) {
            setTurn(player2);
            // Setting underlines visible or invisible acc to player turn
            u1.setVisible(true);
            u2.setVisible(false);
        } else {
            setTurn(player1);
            u2.setVisible(true);
            u1.setVisible(false);
        }
    }

    /**
     * Calls the appropriate draw function as per the players turn and symbol.
     * shows alert if win is true and if yes disables all buttons
     *
     * @param startX X-coordinate of the point to start drawing from
     * @param startY Y-coordinate of the point to start drawing from
     */
    private void draw(int startX, int startY)
    {
        if (getTurn() == player1) {
            if (player1.getSymbol() == SymbolsEnum.CROSS) {
                Draw.draw_cross(gc, startX, startY);
            } else {
                Draw.draw_circle(gc, startX, startY);
            }
        } else if (getTurn() == player2) {
            if (player2.getSymbol() == SymbolsEnum.CROSS) {
                Draw.draw_cross(gc, startX, startY);
            } else {
                Draw.draw_circle(gc, startX, startY);
            }
        }

        // Check if there is win and if yes draw a line and show alert 
        if (win) {

            if (Turn.getTurn() == player1) {
                drawLine();
                showAlert(p1.getText());
            } else {
                drawLine();
                showAlert(p2.getText());
            }
            // Disables all buttons to stop the game
            setAllDisable(true);
        }
    }

    /**
     * Disables or enable s all buttons as per the user choice
     *
     * @param option This could be ture or false
     */
    private void setAllDisable(boolean option)
    {
        b1.setDisable(option);
        b2.setDisable(option);
        b3.setDisable(option);
        b4.setDisable(option);
        b5.setDisable(option);
        b6.setDisable(option);
        b7.setDisable(option);
        b8.setDisable(option);
        b9.setDisable(option);
    }

    /**
     * Disables or enables all radio buttons and the textfields
     *
     * @param option This could be true or false
     */
    private void disableChoices(boolean option)
    {
        X1.setDisable(option);
        O1.setDisable(option);
        X2.setDisable(option);
        O2.setDisable(option);
        p1.setDisable(option);
        p2.setDisable(option);
    }

    /**
     * Shows Alert with the player name
     *
     * @param player Player who won or whose turn is it now
     */
    private void showAlert(String player)
    {
        Alerts.Message.showMessage("Congratulations, " + player + " wins!");
//        resetButton(new ActionEvent());
    }

    /**
     * Sets coordinates for the draw_winning_line function and calls the
     * function with the coordinates as parameters
     */
    private void drawLine()
    {
        List<Integer> winningMoves;
        if (getTurn() == player1) {
            winningMoves = Result.getPlayer1moves();
        } else {
            winningMoves = Result.getPlayer2moves();
        }
        Collections.sort(winningMoves);
        int startX = 35, startY = 35, endX = 35, endY = 35;
        switch (winningMoves.get(0)) {
            case 1:
                startX += 50 + 15;
                startY += 50 + 15 + 15;
                switch (winningMoves.get(2)) {
                    case 3:
                        endX += 50 + 15 + 70 + 30 + 70 + 30;
                        endY += 50 + 15 + 15;
                        break;
                    case 7:
                        endX += 50 + 15;
                        endY += 50 + 15 + 15 + 70 + 30 + 70 + 30;
                        break;
                    case 9:
                        endX += 50 + 15 + 70 + 30 + 70 + 30;
                        endY += 50 + 15 + 15 + 70 + 30 + 70 + 30;
                        break;
                }
                break;
            case 2:
                startX += 50 + 15 + 70 + 30;
                startY += 50 + 15 + 15;
                endX += 50 + 15 + 70 + 30;
                endY += 50 + 15 + 70 + 30 + 70 + 30 + 15;
                break;
            case 3:
                startX += 50 + 15 + 70 + 30 + 70 + 30;
                startY += 50 + 15 + 15;
                switch (winningMoves.get(2)) {
                    case 7:
                        endX += 50 + 15;
                        endY += 50 + 15 + 15 + 70 + 30 + 70 + 30;
                        break;
                    case 9:
                        endX += 50 + 15 + 70 + 30 + 70 + 30;
                        endY += 50 + 15 + 15 + 70 + 30 + 70 + 30;
                        break;
                }
                break;
            case 4:
                startX += 50 + 15;
                startY += 50 + 15 + 15 + 70 + 30 + 15;
                endX += 50 + 15 + 70 + 30 + 70 + 30;
                endY += 50 + 15 + 70 + 30 + 15;
                break;
            case 7:
                startX += 50 + 15;
                startY += 50 + 15 + 15 + 70 + 30 + 70 + 30;
                endX += 50 + 15 + 70 + 30 + 70 + 30;
                endY += 50 + 15 + 15 + 70 + 30 + 70 + 30;
                break;
        }
        Draw.draw_winning_line(gc, startX, startY, endX, endY);
    }
}

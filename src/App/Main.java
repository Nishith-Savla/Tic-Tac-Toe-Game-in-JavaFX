package App;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

// @author Nishith
public class Main extends Application
{

    @Override
    public void start(Stage primaryStage) throws IOException
    {
        // Loading the FXML file in the root 
        Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/GameUI.fxml"));
        Scene scene = new Scene(root); // Adding root to a scene
        scene.getStylesheets().add("https://fonts.googleapis.com/css2?family=Saira+Condensed:wght@300&display=swap"); // Loading fonts from google api
        primaryStage.setTitle("TicTacToe Game!");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        launch(args);
    }

}

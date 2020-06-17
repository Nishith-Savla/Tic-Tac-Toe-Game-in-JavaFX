package App;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

// @author Nishith
public class Main extends Application
{

    Draw draw = new Draw();

    @Override
    public void start(Stage primaryStage)
    {
        StackPane root = new StackPane();
        Canvas canvas = new Canvas(400, 400);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc=draw.draw_basic_skeleton(gc);
        gc=draw.draw_cross(gc, 50+15, 50+15);
        gc=draw.draw_circle(gc, 50+15+70+30, 50+15);
        gc=draw.draw_cross(gc, 50+15+70+30+70+30, 50+15);
        root.getChildren().addAll(canvas);
        Scene scene = new Scene(root, 400, 400);
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

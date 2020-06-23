package Alerts;

import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class Message
{

    /**
     * Sets and shows the message
     *
     * @param msg THe message to show
     */
    public static void showMessage(String msg)
    {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
        stage.setAlwaysOnTop(true);
        alert.setHeaderText(null);
        alert.setContentText(msg);
        alert.show();
    }
}

package Alerts;

import javafx.scene.control.Alert;

/**
 *
 * @author Nishith
 */
public class Message
{
    public static void setMessage(String msg)
    {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText(msg);
        alert.show();
    }
}

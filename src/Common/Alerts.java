package Common;

import javafx.scene.control.ButtonType;

import java.util.Optional;

public class Alert {
    public static boolean confirmExitApplication() {
        javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.CONFIRMATION, "All information will be lost.\nDo you want to continue?");
        Optional<ButtonType> result = alert.showAndWait();

        return (result.isPresent() && result.get() == ButtonType.OK);
    }
    public static boolean confirmDelete() {
        return false;
    }
}

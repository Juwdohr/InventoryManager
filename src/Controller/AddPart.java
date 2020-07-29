/**
 * Sample Skeleton for 'AddPart.fxml' Controller Class
 */

package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;

public class AddPartController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="title"
    private Label title; // Value injected by FXMLLoader

    @FXML // fx:id="inHouseRadio"
    private RadioButton inHouseRadio; // Value injected by FXMLLoader

    @FXML // fx:id="partType"
    private ToggleGroup partType; // Value injected by FXMLLoader

    @FXML // fx:id="outsourcedRadio"
    private RadioButton outsourcedRadio; // Value injected by FXMLLoader

    @FXML // fx:id="partNameTextField"
    private TextField partNameTextField; // Value injected by FXMLLoader

    @FXML // fx:id="inventoryTextField"
    private TextField inventoryTextField; // Value injected by FXMLLoader

    @FXML // fx:id="priceTextField"
    private TextField priceTextField; // Value injected by FXMLLoader

    @FXML // fx:id="minInvTextField"
    private TextField minInvTextField; // Value injected by FXMLLoader

    @FXML // fx:id="machineIdTextField"
    private TextField machineIdTextField; // Value injected by FXMLLoader

    @FXML // fx:id="maxInvTextField"
    private TextField maxInvTextField; // Value injected by FXMLLoader

    @FXML // fx:id="saveBtn"
    private Button saveBtn; // Value injected by FXMLLoader

    @FXML // fx:id="cancelBtn"
    private Button cancelBtn; // Value injected by FXMLLoader

    @FXML
    void cancel(MouseEvent event) {

    }

    @FXML
    void savePart(MouseEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert title != null : "fx:id=\"title\" was not injected: check your FXML file 'AddPart.fxml'.";
        assert inHouseRadio != null : "fx:id=\"inHouseRadio\" was not injected: check your FXML file 'AddPart.fxml'.";
        assert partType != null : "fx:id=\"partType\" was not injected: check your FXML file 'AddPart.fxml'.";
        assert outsourcedRadio != null : "fx:id=\"outsourcedRadio\" was not injected: check your FXML file 'AddPart.fxml'.";
        assert partNameTextField != null : "fx:id=\"partNameTextField\" was not injected: check your FXML file 'AddPart.fxml'.";
        assert inventoryTextField != null : "fx:id=\"inventoryTextField\" was not injected: check your FXML file 'AddPart.fxml'.";
        assert priceTextField != null : "fx:id=\"priceTextField\" was not injected: check your FXML file 'AddPart.fxml'.";
        assert minInvTextField != null : "fx:id=\"minInvTextField\" was not injected: check your FXML file 'AddPart.fxml'.";
        assert machineIdTextField != null : "fx:id=\"machineIdTextField\" was not injected: check your FXML file 'AddPart.fxml'.";
        assert maxInvTextField != null : "fx:id=\"maxInvTextField\" was not injected: check your FXML file 'AddPart.fxml'.";
        assert saveBtn != null : "fx:id=\"saveBtn\" was not injected: check your FXML file 'AddPart.fxml'.";
        assert cancelBtn != null : "fx:id=\"cancelBtn\" was not injected: check your FXML file 'AddPart.fxml'.";

    }
}

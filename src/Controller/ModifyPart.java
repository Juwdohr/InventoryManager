package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;

public class ModifyPartController {

    @FXML
    private Label title;

    @FXML
    private RadioButton inHouseRadio;

    @FXML
    private ToggleGroup partType;

    @FXML
    private RadioButton outsourcedRadio;

    @FXML
    private TextField partNameTextField;

    @FXML
    private TextField inventoryTextField;

    @FXML
    private TextField priceTextField;

    @FXML
    private TextField minInvTextField;

    @FXML
    private TextField machineIdTextField;

    @FXML
    private TextField maxInvTextField;

    @FXML
    private Button saveBtn;

    @FXML
    private Button cancelBtn;

    @FXML
    void cancel(MouseEvent event) {

    }

    @FXML
    void savePart(MouseEvent event) {

    }

}

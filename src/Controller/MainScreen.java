package Controller;
/**
 * Sample Skeleton for 'MainScreen.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class MainScreenController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="searchPartBtn"
    private Button searchPartBtn; // Value injected by FXMLLoader

    @FXML // fx:id="partSearchTxt"
    private TextField partSearchTxt; // Value injected by FXMLLoader

    @FXML // fx:id="deletePartBtn"
    private Button deletePartBtn; // Value injected by FXMLLoader

    @FXML // fx:id="modifyPartBtn"
    private Button modifyPartBtn; // Value injected by FXMLLoader

    @FXML // fx:id="addPartBtn"
    private Button addPartBtn; // Value injected by FXMLLoader

    @FXML // fx:id="title"
    private Label title; // Value injected by FXMLLoader

    @FXML // fx:id="searchProductBtn"
    private Button searchProductBtn; // Value injected by FXMLLoader

    @FXML // fx:id="productSearchTxt"
    private TextField productSearchTxt; // Value injected by FXMLLoader

    @FXML // fx:id="deleteProductBtn"
    private Button deleteProductBtn; // Value injected by FXMLLoader

    @FXML // fx:id="modifyProductBtn"
    private Button modifyProductBtn; // Value injected by FXMLLoader

    @FXML // fx:id="addProductBtn"
    private Button addProductBtn; // Value injected by FXMLLoader

    @FXML // fx:id="exitBtn"
    private Button exitBtn; // Value injected by FXMLLoader

    @FXML
    void addPart(MouseEvent event) {
        System.out.println("Open Add Part Screen");
    }

    @FXML
    void addProduct(MouseEvent event) {
        System.out.println("Open Add Product Screen");
    }

    @FXML
    void deletePart(MouseEvent event) {
        System.out.println("Delete Part");
    }

    @FXML
    void deleteProduct(MouseEvent event) {
        System.out.println("Delete Product");
    }

    @FXML
    void modifyPart(MouseEvent event) {
        System.out.println("Open Modify Part Screen");
    }

    @FXML
    void modifyProduct(MouseEvent event) {
        System.out.println("Open Modify Product Screen");
    }

    @FXML
    void searchParts(MouseEvent event) {
        System.out.println("Search Parts");
    }

    @FXML
    void searchProducts(MouseEvent event) {
        System.out.println("Search Products");
    }

    @FXML
    void exit(MouseEvent event) {
        Stage stage = (Stage) exitBtn.getScene().getWindow();
        stage.close();
    }


    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert searchPartBtn != null : "fx:id=\"searchPartBtn\" was not injected: check your FXML file 'MainScreen.fxml'.";
        assert partSearchTxt != null : "fx:id=\"partSearchTxt\" was not injected: check your FXML file 'MainScreen.fxml'.";
        assert deletePartBtn != null : "fx:id=\"deletePartBtn\" was not injected: check your FXML file 'MainScreen.fxml'.";
        assert modifyPartBtn != null : "fx:id=\"modifyPartBtn\" was not injected: check your FXML file 'MainScreen.fxml'.";
        assert addPartBtn != null : "fx:id=\"addPartBtn\" was not injected: check your FXML file 'MainScreen.fxml'.";
        assert title != null : "fx:id=\"title\" was not injected: check your FXML file 'MainScreen.fxml'.";
        assert searchProductBtn != null : "fx:id=\"searchProductBtn\" was not injected: check your FXML file 'MainScreen.fxml'.";
        assert productSearchTxt != null : "fx:id=\"productSearchTxt\" was not injected: check your FXML file 'MainScreen.fxml'.";
        assert deleteProductBtn != null : "fx:id=\"deleteProductBtn\" was not injected: check your FXML file 'MainScreen.fxml'.";
        assert modifyProductBtn != null : "fx:id=\"modifyProductBtn\" was not injected: check your FXML file 'MainScreen.fxml'.";
        assert addProductBtn != null : "fx:id=\"addProductBtn\" was not injected: check your FXML file 'MainScreen.fxml'.";
        assert exitBtn != null : "fx:id=\"exitBtn\" was not injected: check your FXML file 'MainScreen.fxml'.";
    }
}

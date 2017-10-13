package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController {
    public Button menuStockButton;
    public Button menuOrderButton;
    public Button menuNewOrder;

    public void menuStockClicked(ActionEvent actionEvent) {
        
    }

    public void menuOrderClicked(ActionEvent actionEvent) {

    }

    public void menuNewOrderClicked(ActionEvent actionEvent) {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("YeniSatis.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Yeni Satış");
            stage.setScene(new Scene(root, 700, 800));
            stage.show();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

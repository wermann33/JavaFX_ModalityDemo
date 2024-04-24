package net.jwizard.javafx_modalitydemo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class NewWindowController implements Initializable {

    @FXML
    private Label labelNewWindow;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    protected void show(String title, Modality m, Stage currentStage) throws IOException {
        FXMLLoader fl = new FXMLLoader();
        fl.setLocation(NewWindowController.class.getResource("newWindow.fxml"));
        fl.load();
        Parent root = fl.getRoot();
        Stage newStage = new Stage();
        newStage.initOwner(currentStage);
        newStage.initModality(m);
        newStage.setResizable(false);
        Scene scene = new Scene(root, 200, 60 );
        newStage.setScene(scene);
        newStage.setTitle(title);
        newStage.show();
        ((NewWindowController) fl.getController()).labelNewWindow.setText(title);
    }
}

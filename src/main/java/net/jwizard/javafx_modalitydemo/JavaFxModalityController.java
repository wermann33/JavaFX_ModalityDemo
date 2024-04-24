package net.jwizard.javafx_modalitydemo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class JavaFxModalityController {
    @FXML
    static NewWindowController newWindowController = new NewWindowController();

    @FXML
    protected void openNoneWindow(ActionEvent event) throws IOException {
        Stage currentStage = getRoot(event);
        newWindowController.show("None Modality", Modality.NONE, currentStage);

    }

    @FXML
    protected void openApplicationModalWindow(ActionEvent event) throws IOException {
        Stage currentStage = getRoot(event);
        newWindowController.show("Application Modality", Modality.APPLICATION_MODAL, currentStage);
    }

    @FXML
    protected void openWindowModalWindow(ActionEvent event) throws IOException {
        Stage currentStage = getRoot(event);
        newWindowController.show("Window Modality", Modality.WINDOW_MODAL, currentStage);
    }

    private static Stage getRoot(ActionEvent event){
        Node root = (Node) event.getSource();
        return (Stage) root.getScene().getWindow();
    }


}
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Theodore Linardic
 */

package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SaveFileManagerController {

    @FXML
    private TextField filePath;

    public void saveFileButtonClicked(ActionEvent actionEvent) {
        ToDoListManagerController.saveFile(filePath.getText());

        Stage stage = (Stage) filePath.getScene().getWindow();

        stage.close();


    }

    public void cancel(ActionEvent actionEvent) {
        Stage stage = (Stage) filePath.getScene().getWindow();

        stage.close();


    }


}

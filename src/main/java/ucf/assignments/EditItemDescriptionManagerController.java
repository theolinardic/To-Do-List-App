/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Theodore Linardic
 */

package ucf.assignments;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class EditItemDescriptionManagerController {


    @FXML
    public TextField newDescriptionInput;

    @FXML
    public void changeDescription(ActionEvent actionEvent) {
        // Call function 'editItemDescription' with paramter newDescriptionInput in class ListItem.
        // Call on ListItem object based on currently selected item.

        ToDoListManagerController.editItemDescription(newDescriptionInput.getText());

        Stage stage = (Stage) newDescriptionInput.getScene().getWindow();

        stage.close();
    }

    @FXML
    public void cancel(ActionEvent actionEvent) {
        // Close window.

        Stage stage = (Stage) newDescriptionInput.getScene().getWindow();

        stage.close();
    }

}

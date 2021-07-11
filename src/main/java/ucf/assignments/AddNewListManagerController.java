/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Theodore Linardic
 */

package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.time.format.DateTimeFormatter;

public class AddNewListManagerController {

    @FXML
    private DatePicker newItemDueDateInput;

    @FXML
    private TextField newItemNameInput;


    public void addList(ActionEvent actionEvent) {
        // Call function 'addItemToList' with text in TextField and DatePiccker date.
        // Close Window

        ToDoListManagerController.addItemToList(newItemNameInput.getText(),newItemDueDateInput.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));

        Stage stage = (Stage) newItemDueDateInput.getScene().getWindow();

        stage.close();


    }

    public void cancelAddList(ActionEvent actionEvent) {
        // Close current window

        Stage stage = (Stage) newItemDueDateInput.getScene().getWindow();

        stage.close();

    }
}

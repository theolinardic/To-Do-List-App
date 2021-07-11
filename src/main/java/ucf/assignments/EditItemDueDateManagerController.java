/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Theodore Linardic
 */

package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.time.format.DateTimeFormatter;

public class EditItemDueDateManagerController {

    @FXML
    public DatePicker newDueDateInput;

    @FXML
    public void changeDueDate(ActionEvent actionEvent) {

        // Call function 'editItemDueDate' with paramter newDueDateInput in class ListItem.
        // Call on ListItem object based on currently selected item.

        ToDoListManagerController.editItemDueDate(newDueDateInput.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));

        Stage stage = (Stage) newDueDateInput.getScene().getWindow();

        stage.close();
    }

    @FXML
    public void cancel(ActionEvent actionEvent) {
        // Close window.

        Stage stage = (Stage) newDueDateInput.getScene().getWindow();

        stage.close();
    }
}

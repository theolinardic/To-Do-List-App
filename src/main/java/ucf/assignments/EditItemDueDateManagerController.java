/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Theodore Linardic
 */

package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class EditItemDueDateManagerController {

    @FXML
    public TextField newDueDateInput;

    @FXML
    public void changeDueDate(ActionEvent actionEvent) {

        // Call function 'editItemDueDate' with paramter newDueDateInput in class ListItem.
        // Call on ListItem object based on currently selected item.
    }

    @FXML
    public void cancel(ActionEvent actionEvent) {
        // Close window.
    }
}

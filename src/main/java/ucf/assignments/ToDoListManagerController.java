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

import java.io.IOException;

public class ToDoListManagerController {

    @FXML
    public Text CurrentlySelectedToDoListLabel;
    
    @FXML
    private ListView AllToDoLists;

    @FXML
    private ListView AllItemsInCurrentToDoList;



    @FXML
    public void addListButtonClicked(ActionEvent actionEvent){
        // This function opens a new window of 'AddNewListManager'.
        AllToDoLists.getItems().add("test");
    }

    @FXML
    public void closeProgram(ActionEvent actionEvent) {
        //This function will close the program.
    }

    @FXML
    public void viewAllListItems(ActionEvent actionEvent) {
        // For int = 0; int < totalNumberOfItems
        //      Display Every Item
    }

    @FXML
    public void viewAllCompleteListItems(ActionEvent actionEvent) {
        // For int = 0; int < totalNumberOfItems
        //      Display Every Complete item and hide all non completed items.
    }

    @FXML
    public void viewAllIncompleteListItems(ActionEvent actionEvent) {
        // For int = 0; int < totalNumberOfItems
        //      Display Every Incomplete item and hide all completed items.
    }

    @FXML
    public void deleteListButtonClicked(ActionEvent actionEvent) {
        //Call function removeToDoList in ToDoListModel and pass through name of currently selected to do list.
    }

    @FXML
    public void editListButtonClicked(ActionEvent actionEvent) {
        //Call function editToDoList in ToDoListObject and pass through name of currently selected to do list.
    }

    @FXML
    public void viewListButtonClicked(ActionEvent actionEvent) {
        //Call function displayAllItemsInList in ToDoListObject and pass through name of currently selected to do lkist.
    }

    @FXML
    public void addNewItemToListButtonClicked(ActionEvent actionEvent) {
        //Open window 'AddNewListManager'.
    }

    @FXML
    public void deleteCurrentItemFromListButtonClicked(ActionEvent actionEvent) {
        //Call function removeItemFromList on listItem. Find listItem based on currently selected to do list and item.
    }

    @FXML
    public void editCurrentItemDescriptionButtonClicked(ActionEvent actionEvent) {
        //Open window 'EditItemDescriptionManager'
    }

    @FXML
    public void editCurrentItemDueDateButtonClicked(ActionEvent actionEvent) {
        //Open window 'EditItemDueDateManager'
    }

    @FXML
    public void markItemCompleteButtonClicked(ActionEvent actionEvent) {
        // Call function markItemComplete on object ListItem based on the current list item that is selected.
    }

    @FXML
    public void markItemIncompleteButtonClicked(ActionEvent actionEvent) {
        // Call function markItemIncomplete on object ListItem based on the current list item that is selected.
    }
}

/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Theodore Linardic
 */

package ucf.assignments;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

import java.io.IOException;
import java.util.ArrayList;

public class ToDoListManagerController {

    public ToDoListObject userToDoList = new ToDoListObject();

    @FXML
    public Text CurrentlySelectedToDoListLabel;

    @FXML
    private ListView AllItemsInToDoList;

    @FXML
    private TableColumn DueDateItemsDisplay;

    @FXML
    private TableColumn TaskItemsDisplay;

    @FXML
    public void closeProgramButtonClicked(ActionEvent actionEvent) {
        //This function will close the program.
        //System.exit(0);
        ListItem newListItem = new ListItem();
        newListItem.itemDueDate = "1920-23-12";
        newListItem.itemDescription = "TestItem";
        userToDoList.listItems.add(newListItem);
    }

    @FXML
    public void viewAllListItemsButtonClicked(ActionEvent actionEvent) {
        // For int = 0; int < totalNumberOfItems
        //      Display Every Item

       // AllItemsInToDoList = new ListView<String>();

        for(int i = 0; i < userToDoList.listItems.size(); i++){
            String listItemToAdd = userToDoList.listItems.get(i).itemDescription + " --- " + userToDoList.listItems.get(i).itemDueDate;
            //System.out.print(listItemToAdd);
            AllItemsInToDoList.getItems().add(listItemToAdd);
        }
        System.out.print(AllItemsInToDoList.getItems().get(0));
        AllItemsInToDoList.refresh();


    }

    @FXML
    public void viewAllCompleteListItemsButtonClicked(ActionEvent actionEvent) {
        // For int = 0; int < totalNumberOfItems
        //      Display Every Complete item and hide all non completed items.
    }

    @FXML
    public void viewAllIncompleteListItemsButtonClicked(ActionEvent actionEvent) {
        // For int = 0; int < totalNumberOfItems
        //      Display Every Incomplete item and hide all completed items.
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

    @FXML
    public void clearListButtonClicked(ActionEvent actionEvent){

    }

    @FXML
    public void saveListButtonClicked(ActionEvent actionEvent){

    }

    @FXML
    public void loadListButtonClicked(ActionEvent actionEvent){

    }
}

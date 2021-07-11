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
import javafx.scene.SubScene;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListManagerController {

    public static ToDoListObject userToDoList = new ToDoListObject();

    public static String currentlySelected;

    @FXML
    public Text CurrentlySelectedToDoListLabel;

    @FXML
    private ListView AllItemsInToDoList;

    @FXML
    public void closeProgramButtonClicked(ActionEvent actionEvent) {
        //This function will close the program.
        System.exit(0);

    }

    @FXML
    public void viewAllListItemsButtonClicked(ActionEvent actionEvent) {
        // For int = 0; int < totalNumberOfItems
        //      Display Every Item


        AllItemsInToDoList.getItems().clear();

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

        AllItemsInToDoList.getItems().clear();

        for(int i = 0; i < userToDoList.listItems.size(); i++){
            if(userToDoList.listItems.get(i).isCompleted == true){
                String listItemToAdd = userToDoList.listItems.get(i).itemDescription + " --- " + userToDoList.listItems.get(i).itemDueDate;
                //System.out.print(listItemToAdd);
                AllItemsInToDoList.getItems().add(listItemToAdd);
            }
        }
        AllItemsInToDoList.refresh();
    }

    @FXML
    public void viewAllIncompleteListItemsButtonClicked(ActionEvent actionEvent) {
        // For int = 0; int < totalNumberOfItems
        //      Display Every Incomplete item and hide all completed items.

        AllItemsInToDoList.getItems().clear();

        for(int i = 0; i < userToDoList.listItems.size(); i++){
            if(userToDoList.listItems.get(i).isCompleted == false){
                String listItemToAdd = userToDoList.listItems.get(i).itemDescription + " --- " + userToDoList.listItems.get(i).itemDueDate;
                //System.out.print(listItemToAdd);
                AllItemsInToDoList.getItems().add(listItemToAdd);
            }
        }
        AllItemsInToDoList.refresh();
    }

    @FXML
    public void addNewItemToListButtonClicked(ActionEvent actionEvent) {
        //Open window 'AddNewListManager'.

        try {
            Parent root = FXMLLoader.load(getClass().getResource("AddNewListManager.fxml"));

            Scene scene = new Scene(root);

            Stage stage = new Stage();

            stage.setScene(scene);
            stage.setTitle("Add New Item");
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    public void deleteCurrentItemFromListButtonClicked(ActionEvent actionEvent) {
        //Call function removeItemFromList on listItem. Find listItem based on currently selected to do list and item.

        String label = AllItemsInToDoList.getSelectionModel().getSelectedItems().toString();
        int position = 0;
        for(int i = 0; i < label.length(); i++){
            if (label.charAt(i) == '-' & label.charAt(i+1) == '-' && label.charAt(i+2) == '-') {
                position = i;
                break;
            }
        }

        label = label.substring(1, position-1);


        for(int i = 0; i < userToDoList.listItems.size(); i++){
            if(userToDoList.listItems.get(i).itemDescription.toString().equals(label)){
                userToDoList.listItems.remove(i);
            }
        }


        //Then refresh list

        AllItemsInToDoList.getItems().clear();

        for(int i = 0; i < userToDoList.listItems.size(); i++){
            String listItemToAdd = userToDoList.listItems.get(i).itemDescription + " --- " + userToDoList.listItems.get(i).itemDueDate;
            //System.out.print(listItemToAdd);
            AllItemsInToDoList.getItems().add(listItemToAdd);
        }
        AllItemsInToDoList.refresh();

    }

    @FXML
    public void editCurrentItemDescriptionButtonClicked(ActionEvent actionEvent) {
        //Open window 'EditItemDescriptionManager'

        currentlySelected = AllItemsInToDoList.getSelectionModel().getSelectedItems().toString();

        int position = 0;
        for(int i = 0; i < currentlySelected.length(); i++){
            if (currentlySelected.charAt(i) == '-' & currentlySelected.charAt(i+1) == '-' && currentlySelected.charAt(i+2) == '-') {
                position = i;
                break;
            }
        }

        currentlySelected = currentlySelected.substring(1, position-1);


        try {
            Parent root = FXMLLoader.load(getClass().getResource("EditItemDesciptionManager.fxml"));

            Scene scene = new Scene(root);

            Stage stage = new Stage();

            stage.setScene(scene);
            stage.setTitle("Edit Item Description");
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    public void editCurrentItemDueDateButtonClicked(ActionEvent actionEvent) {
        //Open window 'EditItemDueDateManager'

        currentlySelected = AllItemsInToDoList.getSelectionModel().getSelectedItems().toString();

        int position = 0;
        for(int i = 0; i < currentlySelected.length(); i++){
            if (currentlySelected.charAt(i) == '-' & currentlySelected.charAt(i+1) == '-' && currentlySelected.charAt(i+2) == '-') {
                position = i;
                break;
            }
        }

        currentlySelected = currentlySelected.substring(1, position-1);


        try {
            Parent root = FXMLLoader.load(getClass().getResource("EditItemDueDateManager.fxml"));

            Scene scene = new Scene(root);

            Stage stage = new Stage();

            stage.setScene(scene);
            stage.setTitle("Edit Item Description");
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void markItemCompleteButtonClicked(ActionEvent actionEvent) {
        // Call function markItemComplete on object ListItem based on the current list item that is selected.

        String label = AllItemsInToDoList.getSelectionModel().getSelectedItems().toString();
        int position = 0;
        for(int i = 0; i < label.length(); i++){
            if (label.charAt(i) == '-' & label.charAt(i+1) == '-' && label.charAt(i+2) == '-') {
                position = i;
                break;
            }
        }

        label = label.substring(1, position-1);


        for(int i = 0; i < userToDoList.listItems.size(); i++){
            if(userToDoList.listItems.get(i).itemDescription.toString().equals(label)){
                userToDoList.listItems.get(i).isCompleted = true;
            }
        }
    }

    @FXML
    public void markItemIncompleteButtonClicked(ActionEvent actionEvent) {
        // Call function markItemIncomplete on object ListItem based on the current list item that is selected.

        String label = AllItemsInToDoList.getSelectionModel().getSelectedItems().toString();
        int position = 0;
        for(int i = 0; i < label.length(); i++){
            if (label.charAt(i) == '-' & label.charAt(i+1) == '-' && label.charAt(i+2) == '-') {
                position = i;
                break;
            }
        }

        label = label.substring(1, position-1);


        for(int i = 0; i < userToDoList.listItems.size(); i++){
            if(userToDoList.listItems.get(i).itemDescription.toString().equals(label)){
                userToDoList.listItems.get(i).isCompleted = false;
            }
        }
    }

    @FXML
    public void clearListButtonClicked(ActionEvent actionEvent){
        AllItemsInToDoList.getItems().clear();
        AllItemsInToDoList.refresh();

        userToDoList.listItems.clear();
    }

    @FXML
    public void saveListButtonClicked(ActionEvent actionEvent){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("SaveFile.fxml"));

            Scene scene = new Scene(root);

            Stage stage = new Stage();

            stage.setScene(scene);
            stage.setTitle("Save File");
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void loadListButtonClicked(ActionEvent actionEvent){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("LoadFile.fxml"));

            Scene scene = new Scene(root);

            Stage stage = new Stage();

            stage.setScene(scene);
            stage.setTitle("Load File");
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addItemToList(String description, String dueDate) {
        if(description.length() > 0 && description.length() < 257){
            userToDoList.addItemToList(description, dueDate);
        }

    }

    public static void editItemDescription(String newDescription){
        for(int i = 0; i < userToDoList.listItems.size(); i++){
            if(userToDoList.listItems.get(i).itemDescription.equals(currentlySelected)){
                userToDoList.listItems.get(i).itemDescription = newDescription;
                break;
            }
        }

    }

    public static void editItemDueDate(String newDueDate){
        for(int i = 0; i < userToDoList.listItems.size(); i++){
            if(userToDoList.listItems.get(i).itemDescription.equals(currentlySelected)){
                userToDoList.listItems.get(i).itemDueDate = newDueDate;
                break;
            }
        }

    }

    public static void saveFile(String saveLocation){
        try{
            PrintWriter fileWriter = new PrintWriter(saveLocation, "UTF-8");
            for(int i = 0; i < userToDoList.listItems.size();i++){
                fileWriter.println(userToDoList.listItems.get(i).itemDescription + "&&&" + userToDoList.listItems.get(i).itemDueDate + "&&&" + userToDoList.listItems.get(i).isCompleted);
            }
            fileWriter.close();
        }
        catch (IOException e){
            System.out.print("Error saving file.");
        }

    }

    public static void loadFile(String saveLocation){
        try{
            File loadedFile = new File(saveLocation);
            Scanner fileScanner = new Scanner(loadedFile);

            userToDoList.listItems.clear();

            while(fileScanner.hasNextLine()){
                String readLine = fileScanner.nextLine();
                int saveDataTracker = 0;
                int prevPos = 0;
                String description = "", dueDate = "", isCompleted = "";
                for(int i = 0; i < readLine.length(); i++){
                    if(readLine.charAt(i) =='&' && readLine.charAt(i+1) == '&' && readLine.charAt(i+2) == '&'){
                        if(saveDataTracker == 0){
                            description = readLine.substring(0, i);
                            prevPos = i;
                        }
                        else if(saveDataTracker == 1){
                            dueDate = readLine.substring(prevPos+3, i);
                            prevPos = i;
                        }
                        saveDataTracker++;
                    }

                    if(i+1 == readLine.length()){
                        isCompleted = readLine.substring(prevPos+3, readLine.length());
                    }
                }

                ListItem newListItem = new ListItem();
                newListItem.itemDescription = description;
                newListItem.itemDueDate = dueDate;
                if(isCompleted.equals("true")){
                    newListItem.isCompleted = true;
                }
                else{
                    newListItem.isCompleted = false;
                }

                userToDoList.listItems.add(newListItem);
            }

        }
        catch(Exception e){

        }

    }



}

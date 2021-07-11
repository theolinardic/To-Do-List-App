/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Theodore Linardic
 */

package ucf.assignments;

import java.util.ArrayList;

public class ToDoListObject {

    ArrayList<ListItem> listItems = new ArrayList<ListItem>();
    Boolean isVisible;
    
    public ToDoListObject() {
        isVisible = true;
    }


    public void addItemToList(String description, String dueDate){
        //Add New Item with description 'description' and due date 'dueDate' to listItems array.

        ListItem newListItem = new ListItem();
        newListItem.itemDescription = description;
        newListItem.itemDueDate = dueDate;
        listItems.add(newListItem);
    }

    public static void displayAllItemsInList(){
        // for all items in list
        //      set visible to true on each object.
    }

    public static void displayAllIncompleteItemsInList(){
        // for all items in list
        //      set visible to true on each object with variable isComplete false.

    }

    public static void displayAllCompleteItemsInList(){
        // for all items in list
        //      set visible to true on each object with variable isComplete true.
    }

    public static void saveList(String saveLocation){
        //if file does not exist at saveLocation
        //      create directory and file
        //open file at saveLocation
        // write data of list to file
        // close file

    }

    public static void loadList(String saveLocation){
        //if file does not exist at saveLocation
        //      create directory and file
        //open file at saveLocation
        // write data of list to file
        // close file
    }


}

/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Theodore Linardic
 */

package ucf.assignments;


public class ListItem {
    boolean isCompleted;
    String itemDescription;
    String itemDueDate;

    public ListItem(){
        isCompleted = false;
    }

    public void markItemComplete(){
        isCompleted = true;
    }

    public void markItemIncomplete(){
        //Set isCompleted to false.
        isCompleted = false;
    }

    public void editItemDescription(String newDescription){
        //Change current objects itemDescription string to the new string provided with paramter newDescription.
        itemDescription = newDescription;
    }

    public void editItemDueDate(String newDueDate){
        //Change current objects itemDueDate string to the new string provided with paramter newDueDate.
        itemDueDate = newDueDate;
    }


}

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

    public static void markItemComplete(){
        //Set isCompleted to true.
    }

    public static void markItemIncomplete(){
        //Set isCompleted to false.
    }

    public static void editItemDescription(String newDescription){
        //Change current objects itemDescription string to the new string provided with paramter newDescription.
    }

    public static void editItemDueDate(String newDueDate){
        //Change current objects itemDueDate string to the new string provided with paramter newDueDate.
    }

    public static void removeItemFromList(){
        //Delete the current item.
    }

}

/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Theodore Linardic
 */

package ucf.assignments;

import java.util.ArrayList;

public class ToDoListModel {

    ArrayList<ToDoListObject> ToDoLists = new ArrayList<ToDoListObject>();

    public static void addNewToDoList(String newListName){
        //Add New To Do List to ToDoLists with the name newListName
    }

    public static void removeToDoList(String listName){
        //Find object in ToDoLists with name ListName
        //Delete that object from ToDoLists.
    }

    public static void saveAllLists(String saveLocation){
        //Find Directory of SaveLocation
        //If directory does not exist:
        //        create folder and files at that location.
        //Open file at saveLocation
        //Write AllLists to file at that location.
    }

    public static void loadList(String saveLocation){

        //Find Directory of SaveLocation
        //If directory does not exist:
        //        tell user file cannot be found.
        //else:
        //          open file at saveLocation
        //          parse through data and create new list with that information

    }

    public static void loadLists(String saveLocation){
        //Find Directory of SaveLocation
        //If directory does not exist:
        //        tell user file cannot be found.
        //else:
        //          open file at saveLocation
        //          parse through data and create new lists with that information
    }
}

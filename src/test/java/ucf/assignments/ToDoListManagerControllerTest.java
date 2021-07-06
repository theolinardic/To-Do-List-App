package ucf.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListManagerControllerTest {

    @Test
    void addListButtonClicked() {
        //Click the add list button
        //Assert that window 'addnewlistmanager' opened
    }

    @Test
    void closeProgram() {
        //Click the closeProgram button
        //Assert that program closed
    }

    @Test
    void viewAllListItems() {
        //Click the viewAllListItems button
        //assert that every item on current to do list is displayed
    }

    @Test
    void viewAllCompleteListItems() {
        //Click the view all complete items button
        //assert that every item displayed has isComplete = true.
    }

    @Test
    void viewAllIncompleteListItems() {
        //Click the view all incomplete items button
        //assert that every item displayed has isComplete = false.
    }

    @Test
    void deleteListButtonClicked() {
        //Click the delete list button
        //assert that selected items no longer exists in ArrayList of LIsts on ToDoListModel.
    }

    @Test
    void editListButtonClicked() {
        //Click the edit list button
        //Assert that currently selceted list has new name.
    }

    @Test
    void viewListButtonClicked() {
        //Click the view list button
        //assert that the list displayed is the list currently selected.
    }

    @Test
    void addNewItemToListButtonClicked() {
        //Click the add new item to list button.
        //Assert that winodw 'addNewListManager' opened
    }

    @Test
    void deleteCurrentItemFromListButtonClicked() {
        //Click the delete current item button/
        //Assert that the selected item no longer exists in todolist array.
    }

    @Test
    void editCurrentItemDescriptionButtonClicked() {
        // Click the edit current item description button
        // Assert that window 'editItemDescriptionManager' opened.
    }

    @Test
    void editCurrentItemDueDateButtonClicked() {
        // Click the edit current item due date button
        // Assert that window 'editItemDueDateManager' opened.
    }

    @Test
    void markItemCompleteButtonClicked() {
        //Click the mark item as complete button
        //assert that selected item has isComplete = true.
    }

    @Test
    void markItemIncompleteButtonClicked() {
        //Click the mark item as incomplete button
        //assert that selected item has isComplete = false.
    }
}
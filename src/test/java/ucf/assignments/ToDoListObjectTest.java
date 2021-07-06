package ucf.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListObjectTest {

    @Test
    void editToDoListTitle() {
        //assert that current to do list has title of newName.
    }

    @Test
    void addItemToList() {
        //Assert that current to do list has item with description Description and due date dueDate.
    }

    @Test
    void displayAllItemsInList() {
        //Assert that all objects in list have isVisible = true.
    }

    @Test
    void displayAllIncompleteItemsInList() {
        //Assert that all objects that have isComplete = false in list have isVisible = true.
        //Assert that all objects that have isComplete = true in list have isVisible = false.
    }

    @Test
    void displayAllCompleteItemsInList() {
        //Assert that all objects that have isComplete = false in list have isVisible = false.
        //Assert that all objects that have isComplete = true in list have isVisible = true.
    }

    @Test
    void saveList() {
        //Assert that file exists at saveLocation
    }
}
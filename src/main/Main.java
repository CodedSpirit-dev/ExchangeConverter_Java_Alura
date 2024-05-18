package main;

import exchangeconverter.view.ConsoleView;

/**
 * The Main class serves as the entry point for the Exchange Rate Converter application.
 * It initializes the user interface and starts the application.
 */
public class Main {
    /**
     * The main method is the entry point of the application.
     * It creates an instance of the ConsoleView class and displays the main menu to the user.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args){
        ConsoleView consoleView = new ConsoleView();
        consoleView.showMenu();
    }
}
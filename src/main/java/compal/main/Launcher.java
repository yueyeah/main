package compal.main;

import javafx.application.Application;


/**
 * This class merely holds the launch code to start the GUI (calls start()) and passes CLI args.
 */
public class Launcher {


    public static void main(String[] args) {
        Application.launch(Duke.class, args);
    }

}
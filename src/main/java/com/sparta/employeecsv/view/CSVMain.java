package com.sparta.employeecsv.view;

import com.sparta.employeecsv.controller.CSVController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CSVMain {

    public static Logger logger = LogManager.getLogger("CSV-Logger");

    /**
     * Launch the application.
     */
    public static void main(String[] args) {

        try {

            CSVController controller = new CSVController();
            DisplayManager window = new DisplayManager(controller);

            window.initialize();
            window.frame.setVisible(true);

            controller.setupDatabase();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

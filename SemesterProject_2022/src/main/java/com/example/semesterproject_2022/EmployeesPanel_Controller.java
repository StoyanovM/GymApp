package com.example.semesterproject_2022;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class EmployeesPanel_Controller {
    @FXML
    private Text texttbchanged;

    @FXML
    void changetxt(ActionEvent event) {
        texttbchanged.setText("This is Employees Panel");

    }
}

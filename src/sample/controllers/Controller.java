package sample.controllers;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import sample.models.Student;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Label lblFirstName;

    @FXML
    private Label lblStudentNum;

    @FXML
    private Label lblLastName;

    @FXML
    private ImageView imageView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Student student = new Student("Mason","Douglas",1135879);

        lblFirstName.setText(student.getFirstName());
        lblLastName.setText(student.getLastName());
        lblStudentNum.setText(Integer.toString(student.getStudentNumber()));
        imageView.setImage(student.getImage());

    }

}
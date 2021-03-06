package sample.controllers;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import sample.models.Student;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
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

    @FXML
    private ListView<String> lstIntrest;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        List favAct = new ArrayList<String>();
        favAct.add("Warhammer");
        favAct.add("Video games");
        favAct.add("Coding");
        Student student = new Student("mason","Douglas",1135879,favAct);
        System.out.println(student.getInterest());
        lblFirstName.setText(student.getFirstName());
        lblLastName.setText(student.getLastName());
        lblStudentNum.setText(Integer.toString(student.getStudentNumber()));
        imageView.setImage(student.getImage());
        for(int i = 0; i < student.getInterest().size();i++){
            String item = (student.getInterest().get(i)).toString();
            System.out.println(i);
            System.out.println(item);
            lstIntrest.getItems().addAll(item);
        }


    }

}
package sample.models;

import java.awt.*;
import javafx.scene.image.Image;
public class Student {
    private String firstName;
    private String lastName;
    private int studentNumber;
    private Image image;

    public Student(String firstName, String lastName, int studentNumber) {
        setFirstName(firstName);
        setLastName(lastName);
        setStudentNumber(studentNumber);
        setImage();
    }

    public String getFirstName() {
        return firstName;
    }

    private void setImage()
    {
        String filePath = String.format("sample/Images/%s.png",studentNumber);
        this.image = new Image(filePath);
    }

    public Image getImage() {
        return image;
    }



    public void setFirstName(String firstName) {
        if (firstName.length()>0)
            this.firstName = firstName;
        else
            throw new IllegalArgumentException("You must enter a valid First Name");
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.length()>0)
            this.lastName = lastName;
        else
            throw new IllegalArgumentException("You must enter a valid Last Name");
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        if(Integer.toString(studentNumber).length() == 7)
            this.studentNumber = studentNumber;
        else
            throw new IllegalArgumentException("You must enter a valid student number, that is 7 digits long ");

    }
}


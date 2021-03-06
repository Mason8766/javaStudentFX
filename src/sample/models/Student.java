package sample.models;

import java.awt.*;
import javafx.scene.image.Image;
import java.util.List;
public class Student {
    private String firstName;
    private String lastName;
    private int studentNumber;

    private List interest;
    private Image image;

    public Student(String firstName, String lastName, int studentNumber,List interest) {
        setFirstName(firstName);
        setLastName(lastName);
        setStudentNumber(studentNumber);
        setInterest(interest);
        setImage();
    }

    public List getInterest() {
        return interest;
    }

    public void setInterest(List interest) {
        this.interest = interest;
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
        /***
         * Converts the first letter of the string to a capital
         */
        String str = firstName;
        String firstLetter = str.substring(0, 1);
        String remainingLetters = str.substring(1);
        firstLetter = firstLetter.toUpperCase();
        firstName = firstLetter + remainingLetters;

        if (firstName.length()>1)
            this.firstName = firstName;
        else
            throw new IllegalArgumentException("You must enter a valid First Name");
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        /***
         * Converts the first letter of the string to a capital
         */
        String str = firstName;
        String firstLetter = str.substring(0, 1);
        String remainingLetters = str.substring(1);
        firstLetter = firstLetter.toUpperCase();
        firstName = firstLetter + remainingLetters;

        if (lastName.length()>1)
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


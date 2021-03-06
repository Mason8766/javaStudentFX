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

    /***
     * Constructor for Student Class
     * @param firstName
     * @param lastName
     * @param studentNumber
     * @param interest
     */
    public Student(String firstName, String lastName, int studentNumber,List interest) {
        setFirstName(firstName);
        setLastName(lastName);
        setStudentNumber(studentNumber);
        setInterest(interest);
        setImage();
    }

    /***
     * Returns intrest to the user
     * @return
     */
    public List getInterest() {
        return interest;
    }

    /***
     * Sets intrest to value declared in class instance
     * @param interest
     */
    public void setInterest(List interest) {
        this.interest = interest;
    }

    /***
     * returns firstname to user
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /***
     * Sets the file path to the images folder, and the file name, which is equal to the studentNumber+jpg
     * returns image, useing the filepath
     */
    private void setImage()
    {
        String filePath = String.format("sample/Images/%s.jpg",studentNumber); //file path based off student number, to locate image
        this.image = new Image(filePath);
    }

    /***
     * Returns the image to user
     * @return
     */
    public Image getImage() {
        return image;
    }


    /***
     * sets the first name
     * sets the first char of the string to uppercase
     * validates the name is atleast 2 digits long
     *  * provides a error msg if validation fails
     * @param firstName
     */
    public void setFirstName(String firstName) {
        /***
         * Converts the first letter of the string to a capital
         */
        String str = firstName; //copies the inbound string
        String firstLetter = str.substring(0, 1);//grabs first char of string
        String remainingLetters = str.substring(1);//grabs the remaining chars of string
        firstLetter = firstLetter.toUpperCase();//uppercases the first char
        firstName = firstLetter + remainingLetters;//reassembles the string, and update the inbound variable

        if (firstName.length()>1)
            this.firstName = firstName;
        else
            throw new IllegalArgumentException("You must enter a valid First Name");
    }

    /***
     * returns the lastname to user
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /***
     * Sets the lastname
     * sets the first char of lastname to uppercase
     * validates the name is atleast 2 digits long
     *  * provides a error msg if validation fails
     * @param lastName
     */
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

    /***
     * returns studentnumber to the user
     * @return
     */
    public int getStudentNumber() {
        return studentNumber;
    }

    /***
     * sets student number
     * validates the provided int, is exactly 7 digits long
     * provides a error msg if validation fails
     * @param studentNumber
     */
    public void setStudentNumber(int studentNumber) {
        if(Integer.toString(studentNumber).length() == 7)
            this.studentNumber = studentNumber;
        else
            throw new IllegalArgumentException("You must enter a valid student number, that is 7 digits long ");

    }
}


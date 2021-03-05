package sample.models;
public class studentAssignment {
    public static void main(String[] args)
    {
        Student Mason = new Student("Mason","Douglas",1135879);
        System.out.println(Mason.getFirstName()+" "+Mason.getLastName()+" "+Mason.getStudentNumber());

        Student Luke = new Student("","",1);
    }

}
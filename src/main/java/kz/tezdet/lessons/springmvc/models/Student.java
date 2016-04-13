package kz.tezdet.lessons.springmvc.models;

public class Student {
    private int studentID ;
    private String firstName ;
    private String lastName ;

    public Student(){
    }

    public Student(int studentID, String firstName, String lasrName) {
        this.studentID = studentID ;
        this.firstName = firstName;
        this.lastName = lasrName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLasrName() {
        return lastName;
    }

    public void setLasrName(String lasrName) {
        this.lastName = lasrName;
    }
}

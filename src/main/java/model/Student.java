package model;

public class Student {
    private String firstName;
    private String lastName;
    private int points;
    // Constructor
    public Student(String firstName, String lastName, int points) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (points != 0) {
            this.points = points;
        }
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return "First Name: "+firstName+"\nLast name: "+lastName+"\nNumber of points: "+points;
    }
}

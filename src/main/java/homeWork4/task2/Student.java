package homeWork4.task2;

public class Student {
    private String name;

    private String surname;

    private int numberOfCourse;

    private double averageScore;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", numberOfCourse=" + numberOfCourse +
                ", averageScore=" + averageScore +
                '}';
    }

    public Student(String name, String surname, int numberOfCourse, double averageScore) {
        this.name = name;
        this.surname = surname;
        this.numberOfCourse = numberOfCourse;
        this.averageScore = averageScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getNumberOfCourse() {
        return numberOfCourse;
    }

    public void setNumberOfCourse(int numberOfCourse) {
        this.numberOfCourse = numberOfCourse;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }
}

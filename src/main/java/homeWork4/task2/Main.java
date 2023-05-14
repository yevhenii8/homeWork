package homeWork4.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student student1 = new Student("Ivan", "Makarov",3,9.6);
        Student student2 = new Student("Arsen", "Lupov",4,8.9);
        Student student3 = new Student("Arpad", "Hunger",1,5.1);
        Student student4 = new Student("Liza", "Ivanishina",2,9.8);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        removeOfStudentsByCourse(students);

        removeOfStudentsByName(students, "Ivan");
    }

    public static void removeOfStudentsByCourse(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getNumberOfCourse() < 3) {
                iterator.remove();
            }
        }
    }

    public static void removeOfStudentsByName(List<Student> students, String name) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if (student.getName().equals(name)) {
                iterator.remove();
            }
        }
    }
}

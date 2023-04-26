package homeWork1.task1;

import homeWork1.task1.Person;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Ivan zolo", 19);

        person1.move();
        person1.talk();

        person2.move();
        person2.talk();
    }
}

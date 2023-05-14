package homeWork1.task2;

public class Test {
    public static void main(String[] args) {
        Phone phone1 = new Phone(5, "iphone", 6.5);
        Phone phone2 = new Phone(3, "samsung", 7.3);
        Phone phone3 = new Phone(2, "blackberry", 6.9);

        System.out.println("number: " + phone1.getNumber());
        System.out.println("model: " + phone1.model);
        System.out.println("weight: " + phone1.weight);

        System.out.println();

        System.out.println("number: " + phone2.getNumber());
        System.out.println("model: " + phone2.model);
        System.out.println("weight: " + phone3.weight);

        System.out.println();

        System.out.println("number: " + phone3.getNumber());
        System.out.println("model: " + phone3.model);
        System.out.println("weight: " + phone3.weight);

        System.out.println();

        phone1.receiveCall("Alex");
        phone2.receiveCall("Eugene");
        phone3.receiveCall("Arpad");
    }
}

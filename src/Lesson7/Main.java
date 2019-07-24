package Lesson7;

public class Main {
    public static void main(String[] args) {
        Contact contact1 = new Contact("Иванов", "Иван", "8-923-923-99-22");

        System.out.println(contact1.getFirstName() + " " + contact1.getLastName() + " " +  contact1.getTelephoneNumber());
    }
}

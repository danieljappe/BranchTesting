public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.print("Hunden siger ");
        dog.makeSound();
        System.out.print("og hunden ");
        dog.showMood(false);
        System.out.println();


        System.out.print("Katten siger ");
        cat.makeSound();
        System.out.print("og katten ");
        cat.showMood(true);

    }
}

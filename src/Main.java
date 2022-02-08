import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập loại động vật: ");
        String type = scanner.next();
        AnimalFactory animalFactory = new AnimalFactory();
        Animal animal = animalFactory.getAnimal(type);
        animal.makeSound();
    }
}

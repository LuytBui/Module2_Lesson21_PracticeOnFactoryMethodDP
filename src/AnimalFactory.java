public class AnimalFactory {
    public Animal getAnimal(String type) {
        if (type.toLowerCase().equals("dog"))
            return new Dog();
        if (type.toLowerCase().equals("cat"))
            return new Cat();
        return null;
    }
}

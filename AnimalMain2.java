package poly.ex;

public class AnimalMain2 {
    public static void main(String[] args) {
        Animal[] animals = {
                new Duck(), new Cow(), new Dog(), new Cat()
        };
        for (Animal animal : animals) {
            animal.testSound();
        }
    }
}

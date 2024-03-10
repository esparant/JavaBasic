package poly.ex3;

public class AbstractMain2 {
    public static void main(String[] args) {

        AbstractAnimal2 dog = new Dog();
        AbstractAnimal2 cat = new Cat();
        AbstractAnimal2 cow = new Cow();

        testMove(dog);
        testMove(cat);
        testMove(cow);

        testSound(dog);
        testSound(cat);
        testSound(cow);
    }

    private static void testMove(AbstractAnimal2 animal) {
        System.out.println("걷기 테스트 시작");
        animal.move();
        System.out.println("걷기 테스트 끝");
    }
    private static void testSound(AbstractAnimal2 animal) {
        System.out.println("소리 테스트 시작");
        animal.sound();
        System.out.println("소리 테스트 끝");

    }
}

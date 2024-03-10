package poly.ex4;


public class InterfaceMain {
    public static void main(String[] args) {
//        InterfaceAnimal test = new InterfaceAnimal();
        // 인터페이스는 생성 불가.
        InterfaceAnimal animal1 = new Dog();
        InterfaceAnimal animal2 = new Cat();
        InterfaceAnimal animal3 = new Cow();
        System.out.println(InterfaceAnimal.MY);

        testMove(animal1);
        testSound(animal1);

    }

    private static void testMove(InterfaceAnimal animal) {
        System.out.println("걷기 테스트 시작");
        animal.move();
        System.out.println("걷기 테스트 끝");
    }

    private static void testSound(InterfaceAnimal animal) {
        System.out.println("소리 테스트 시작");
        animal.sound();
        System.out.println("소리 테스트 끝");

    }
}

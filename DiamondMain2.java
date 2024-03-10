package poly.diamond2;

public class DiamondMain2 {
    public static void main(String[] args) {
        AbstractAnimal3 dog = new Dog();
        AbstractAnimal3 bird = new Bird();
        AbstractAnimal3 chicken = new Chicken();

        Bird bird2 = new Bird();
        Fly bird3 = new Bird();
        testMove(bird2);
        testFly(bird2);
        testSound((AbstractAnimal3) bird3);
        // 이것도 아래랑 똑같은 설명이도다
        testFly((Fly) bird); // 다운캐스팅?
        // AbstractAnimal 은 fly 을 애초에 가지고 있지 않기 때문에
        // (Fly) 로 캐스팅(형변환) 한다.
        testFly((Fly) chicken);
    }
    private static void testMove(AbstractAnimal3 animal) {
        System.out.println("걷기 테스트 시작");
        animal.move();
        System.out.println("걷기 테스트 끝");
    }
    private static void testSound(AbstractAnimal3 animal) {
        System.out.println("소리 테스트 시작");
        animal.sound();
        System.out.println("소리 테스트 끝");

    }
    private static void testFly(Fly fly) {
        System.out.println("날기 테스트 시작");
        fly.fly();
        System.out.println("날기 테스트 종료");
    }

}

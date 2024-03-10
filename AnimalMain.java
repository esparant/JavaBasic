package poly.ex;

public class AnimalMain {
    public static void main(String[] args) {
        // 하나의 애니멀이지만 실제로는 다양한 모습을 가지고 있따.
        // 이것을 다형적 참조라고함!
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        Animal animal3 = new Cow();
        Animal animal4 = new Duck();
        animal1.testSound();
        animal2.testSound();
        animal3.testSound();
        animal4.testSound();

    }

}

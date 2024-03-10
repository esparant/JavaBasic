package poly.ex2;

public class AbstractMain {
    public static void main(String[] args) {
//        AbstractAnimal animal = new AbstractAnimal();
        // 추상화 시켜씩때문에 생성이 안된다.

        AbstractAnimal dog = new Dog();
        AbstractAnimal cat = new Cat();
        AbstractAnimal cow = new Cow();

        dog.testSound();
        cat.testSound();
        cow.testSound();


    }
}

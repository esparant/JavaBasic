package poly.diamond2;

public class Bird extends AbstractAnimal3 implements Fly {
    // extends 가 먼저, implements 가 후자
    // 상속은 하나만 플라이는 여러개 가능
    @Override
    public void fly() {
        System.out.println("새가 납니다.");
    }

    @Override
    public void sound() {
        System.out.println("짹짹");
    }
}

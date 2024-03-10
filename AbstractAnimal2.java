package poly.ex3;

public abstract class AbstractAnimal2 {
    public abstract void sound();

    public abstract void move();
    // 모든 것이 추상화 인것이 순수 추상클래스라고한다
    // 부모 타입으로써 껍데기를 주는겄!
    // 특징 1. 인스턴스 생성 못함
    //2.  상속된 자식은 모든 메서드를 오버라이딩
    // 3. 주로다향성을 위해 사용.
    // 이런것을 잘 생각해 보면 순수 추상 클래스는 마치
    // 규칙을 지켜서 구현해야 하는 것 처럼 느낄 수 있다.
    // 마치 인터페이스처럼 느껴진다...!
    // 사실 인터페이스라고함 ㅋㅋ
}

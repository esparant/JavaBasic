package poly.ex4;

public interface InterfaceAnimal {
    // default or public 사용 가능 class 하고 똑같다.
    // 인터페이스는 여러 군데에서 사용할 목적으로 만들어 지기 때문에
    // 보통 public 이 붙여짐. 멤버변수, 메서드도 똑같다잉.
    public abstract void sound(); // public abstract 는 기본으로 제공
    void move();
    public static final int MY = 111;
    // public static final 기본 제공
    int NY = 222;
    // 전부 추상이다!!
    // 상속 vs 구현
    // 부모의 기능을 그대로 물려 받는 것은 상속
    // 기능이 없으면 그건 상속인가?!
    // 부모 인터페이스 기능을 자식이 상속받을 때는 구현이라고 한다.
    // 인터페이스 왜씀?
    // 1. 제약: 인터페이스를 구현하는 곳에서 반드시 구현해라 라는 제약
    // 2. 다중구현, 자바에서 클래스 상속은 부모를 하나만 지정할 수 있다.
    // 반면에 인터페이스는 부모를 여러명 두는 다중 구현이 가능( 다중 상속) 이 가능!

    // 인터페이스도 default 를 사용하면 자신의 메소드를 만들 수 있다.
    // private 도 가능하지만, 아주 특별한 경우에만 사용해야 한다.
}

package extends1.super2;

public class ClassC extends ClassB{
    public ClassC() {
        super(10, 20); // 기본 생성자가 아니기에 생략 못함.
        System.out.println("ClassC 생성자");
    }


}

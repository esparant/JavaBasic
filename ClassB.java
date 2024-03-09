package extends1.super2;

public class ClassB extends ClassA{
    public ClassB(int a) {
        this(a, 200);
//        super();//기본 생성자 생략 가능
        // 자기의 생성자가 두개인 경우!
        // 매개변수가 없는 기본 생성자는 자바가 알아서 생성해주기에!
        // 자식 클래스는 부모의 클래스를 만들어 줘야한다.
//          무조건 첫줄에 생성할것!
        System.out.println("ClassB 생성자 a = " + a);
    }

    public ClassB(int a, int b) {
        super(); // 생략 가능
        // 언젠가 한번은 super 을 반드시 호출해줘야한다.
        System.out.println("Class B 생성자 a = " + a + ", b = " + b);
    }
}

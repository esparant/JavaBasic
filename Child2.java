package extends1.super1;
public class Child2 extends Parent2 {

    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child2.hello");
    }

    public void call() {
        System.out.println("value = " + value);
        // 내 클래스에서 찾기
        System.out.println("super.this.value = " + super.value);
        // super -> 부모 클래스에서 찾기(부모를 가르키는것)

        hello(); // 내꼬
        super.hello(); // 마망
    }
}

package poly.basic.overriding;

public class Child4 extends Parent4{

    public String value = "Child";

    @Override
    public void method() {
        System.out.println("Child4.method");
    }
}

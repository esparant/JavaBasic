package extends1.access.parent;

public class Parent {
    public int publicValue;
    protected int protectedValue;
    int defaultValue;
    private int privateValue;

    public void publicMethod() {
        System.out.println("Parent.publicMethod");
    }

    protected void protectedMethod() {
        System.out.println("Parent.protectedMethod");
    }

    void defaultMethod() {
        System.out.println("Parent.defaultMethod");
    } // soutm 클래스명 메소드명 같이 출력!

    private void privateMethod() {
        System.out.println("Parent.privateMethod");
    }
    public void printParent() {
        System.out.println("==Parent 매서드 안==");
        System.out.println("publicValue = " + publicValue);
        System.out.println("protectedValue = " + protectedValue);
        System.out.println("defaultValue = " + defaultValue);
        System.out.println("privateValue = " + privateValue);

        // 부모 메서드 안에서 모드 접근 가능
        defaultMethod();
        privateMethod();
    }


}

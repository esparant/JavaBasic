package class1.access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        // public 호출가능
        data.publicField = 1;
        data.publicMethod();

        // 같은 패키지 default 호출가능
        data.defaultField = 3;
        data.defaultMethod();

        //private 호출 불가
//        data.privateField = 5;
//        data.privateMethod;

        data.innerAccess();

        data.publicMethod();
        data.defaultMethod();
    }
}

package class1.access.b;

import class1.access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        // public 호출가능
        data.publicField = 1;
        data.publicMethod();

        // 다른 패키지 default 호출불가
//        data.defaultField = 3;
//        data.defaultMethod();

        //private 호출 불가
//        data.privateField = 5;
//        data.privateMethod;

        data.innerAccess();

        data.publicMethod();
    }
}

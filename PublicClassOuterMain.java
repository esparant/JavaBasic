package class1.access.b;

import class1.access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        // public 접근 가능
        PublicClass publicClass = new PublicClass();

        // 다른 패키지 Default 접근 불가
//        DefaultClass1 class1 = new DefaultClass1;
//        DefaultClass2 class2 = new DefaultClass2;
    }
}

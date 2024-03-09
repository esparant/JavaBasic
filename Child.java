package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {
    public void call() {
        publicValue = 1;
        protectedValue = 2; // 상속관계 or 같은 패키지.
//        defaultValue = 3; // 다른 패키지 접근 불가
//        privateValue = 4; // 당연히 안되지
        publicMethod();
        protectedMethod(); // 상속관계 or 같은패키지
//        defaultMethod(); // 당연히 안되지
//        privateMethod(); 당연히 안되지

        printParent();
    }
}

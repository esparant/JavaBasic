package extends1.super2;

public class Super2Main {
    public static void main(String[] args) {
//        ClassC classC = new ClassC();
        // ClassA 가 먼저 그 후 B, C 가 생성된다.

        ClassB classB = new ClassB(100);
    }
}

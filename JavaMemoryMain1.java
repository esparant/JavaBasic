package Memory;

public class JavaMemoryMain1 {
    public static void main(String[] args) {
        System.out.println("main 들어감"); // 1
        method1(10);
        System.out.println("main 나옴"); // 6

    }

     static void method1(int m1) {

        System.out.println("method1 들어감"); // 2
        int cal = m1 * 2;
        method2(cal);
        System.out.println("method1 나옴"); // 5
    }

    static void method2(int m2) {
        System.out.println("method2 들어감"); // 3

        System.out.println("method2 나옴"); // 4
    }
}

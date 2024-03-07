package class1.access.a;

public class PublicClassInnerMain {
    public static void main(String[] args) {
        // public 당연히 접근가능
        PublicClass publicClass = new PublicClass();
        // Default 같은 패키지 니까 당연히 접근가능.
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();

    }
}

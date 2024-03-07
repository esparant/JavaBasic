package class1.access.a;

public class PublicClass {
    public static void main(String[] args) {
        // 클래스는 Default, Public 밖에 사용못함.
        // 자기 자신의 클래스도 생성가능!
        // public 클래스는 반드시 자기 이름하고 같아야함.
        // 만약 public 클래슥 ㅏ두개일 경우 문제 생김
        // 하나만 가능!
        PublicClass publicClass = new PublicClass();
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();
    }
}

// Defalult 클래스는 하나의 클래스 안에 무한정으로 생성가능!
class DefaultClass1 {

}

class DefaultClass2 {

}
package class1.ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("data = " + data); // 주소 미지정 Null!
        data = new Data();
        System.out.println("data = " + data); // 객체가 만들어졌으니 참조값이 나옴
        data = null;
        System.out.println("data = " + data); // 근데 이걸 또 널로 바꿀수있음!
        // 주소가 사라짐!
// 만약 이런 주소를 참조하지 않는 객체가 있으면 자바가 알아서 메모리를 지워준다.
    }
}

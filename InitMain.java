package class1.ref;

public class InitMain {
    public static void main(String[] args) {


        InitData data = new InitData();
        System.out.println("data.value1 = " + data.value1); // 초기화안함
        // 지역변수 는 수동으로 초기화해줘야 하지만
        // 멤버변수는 자동초기화가 됨
        // int = 0, boolean = false, 참조형 = null (참조할 주소가 없다는 뜻)
        System.out.println("data.value1 = " + data.value2); // 초기화함
        // crtl + B 누르면 해당 클래스로 자동 이동!
    }




}

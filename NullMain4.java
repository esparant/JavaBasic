package class1.ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data();
        // 이렇게 주면 해결완료
        System.out.println("bigData.count = " + bigData.count);
        // 당연히 0
        System.out.println("bigData.count = " + bigData.data);
        // Bigdata의 data 의 참조값을 줬으므로 주소가 나온다

        System.out.println("bigData.data.value = " + bigData.data.value);


        // 즉 data 는 null 이기 때문에 NullPointerException 발생
        // 이게 진짜 개발자 많이 괴롭힌다.

    }
}

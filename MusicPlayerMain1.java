package class1.oop1;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        // 음악 on
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");

        //불륨 증가
        volume ++;
        // 불륨 증가
        volume ++;
        System.out.println("volume = " + volume);
        //불륨감소
        volume --;
        System.out.println("volume = " + volume);
        //음악플레이어 상태
        if (isOn) {
            System.out.println("전원 ON");
        } else System.out.println("전원 OFF");
        //음악플레이어 끄기
        System.out.println("음악 플레이어를 종료합니다.");
        isOn = false;

        //이것이 절차 지향
    }
}

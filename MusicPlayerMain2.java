package class1.oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();


        // 음악 on
        on(data);
        System.out.println("음악 플레이어를 시작합니다.");
        //불륨 증가
        volume(data, 3);
        volume(data, 12);
        volume(data, -21);
        volume(data, 2);
        off(data);
        status(data);

        //이것은 클래스와 메서드를통한 모듈화 활용 (절차)
        // 중복제거, 변경영향범위, 메서드 이름추가
    }
    static void volume(MusicPlayerData data, int amount) {
        if(data.volume + amount < 0 ) {
            System.out.println("불륨이 최소입니다.");
            data.volume = 0;
        } else if (data.volume + amount > 10) {
            System.out.println("불륨이 최대입니다.");
            data.volume = 10;
        } else data.volume += amount;
        System.out.println("현재 볼륨 : " + data.volume);
    }
    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("기기 ON");
    }
    static void status(MusicPlayerData data) {
        if(data.isOn) {
            System.out.println("예아");
        } else System.out.println("낫예아");
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("기기 OFF");
    }
}

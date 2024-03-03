package class1.oop1;

public class MusicPlayerData2 {
    int volume;
    boolean isOn;

    void on() {
        if (isOn) {
            System.out.println("이미 음악플레이어가 켜져 있습니다.");
            return;
        }
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    void off() {
        if (!isOn) {
            System.out.println("이미 음악플레이어가 꺼져 있습니다.");
            return;
        }
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    void volumeUp() {
        if (volume == 10) {
            System.out.println("볼륨이 최대입니다.(10)");
            return;
        }
        volume++;
        System.out.println("volume = " + volume);
    }

    void volumeDown() {
        if (volume == 0) {
            System.out.println("볼륨이 최소입니다.(0)");
            return;
        }
        volume--;
        System.out.println("volume = " + volume);
    }

    void showStatus() {
        if (isOn) {
            System.out.println("음악 플레이어가 켜져 있습니다.");
            System.out.println("현재 볼륨 : " + volume);
            return;
        }
        System.out.println("음악 플레이어가 꺼져 있습니다.");
    }
}

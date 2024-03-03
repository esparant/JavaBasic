package class1.oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        // 자동차로 예시를 들자
        // 자동차는 크게 속성과 기능으로 나눌 수있다.
        // 속성 = 차가 검정색이나 하얀색이냐
        // 기능 = 자동차의 기본적인 기능(엑셀) 등등
        // 이런식으로 나누면 편하다
        // 음악플레이어는 기능만 들어있기에 이런식으로 가능하다!
        MusicPlayerData2 data = new MusicPlayerData2();
        data.off();
        data.on();
        data.showStatus();
        data.volumeDown();
        data.volumeUp();
        data.volumeUp();
        data.volumeUp();
        data.volumeDown();
        data.volumeUp();
        data.volumeUp();
        data.volumeUp();
        data.volumeUp();
        data.volumeDown();
        data.volumeUp();
        data.volumeUp();
        data.volumeUp();
        data.volumeUp();
        data.volumeUp();
        data.volumeUp();
        data.volumeUp();
        data.showStatus();
        data.off();
        data.showStatus();
    }
}

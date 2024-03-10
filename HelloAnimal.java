package poly.ex2;

public class HelloAnimal extends AbstractAnimal{
    @Override //오버라이딩 해야 되는 것이 생성안되면
    // 빨간줄 그어진다잉?!
    // 만약 자식도 구현을 못하면 abstract 를 붙여준다.
    public void sound() {

    }
}

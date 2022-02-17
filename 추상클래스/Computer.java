package 추상클래스;
//추상클래스는 상위클래스에서 필수로 정의해야할 함수들을 미리 정의하여
//하위클해스에서 작성했는가 확인하기 위한 클래스이다.
//하위 클래스마다 다르게 작성할코드에 사용한다.
public abstract class Computer {
    public abstract void display();
    public abstract void typing();
    public void turnOn() {
        System.out.println("전원을 켭니다.");
    }    
    public void turnOff() {
        System.out.println("전원을 끕니다.");
    }
}

package 추상클래스;

public class Desktop extends Computer {

    @Override
    public void display() {
        System.out.println("화면입니다.");
    }

    @Override
    public void typing() {
        System.out.println("입력하세요");
    }

    public static void main(String [] args) {
        Desktop a = new Desktop();
        a.typing();
        a.turnOn();
        a.turnOff();
        a.display();
    }
}

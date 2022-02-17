package 추상클래스;
//추상클래스는 바로 사용할 수 없으며 항상 상속하여 사용한다.
//추상 클래스를 한번 더 추상 클래스로 사용이 가능하다.
public abstract class NoteBook extends Computer {
    @Override
    public void turnOn() {
        System.out.println("NoteBook Turn On");
    }
    @Override
    public void display() {
        System.out.println("NoteBook display()");
    }    
}

package 추상클래스;

public class MyNoteBook extends NoteBook{

    @Override
    public void typing() {
        System.out.println("MyNoteBook typing()");
    }

    public static void main(String [] args) {
        MyNoteBook a = new MyNoteBook();
        a.turnOn();
    }
    
}

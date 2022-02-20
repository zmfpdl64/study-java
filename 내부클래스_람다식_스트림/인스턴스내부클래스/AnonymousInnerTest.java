package 내부클래스_람다식_스트림.인스턴스내부클래스;

class Outter2 {
    Runnable getRunnable(int i) {
        int num = 100;
        return new Runnable() {
            @Override
            public void run() {
                System.out.println(i);
                System.out.println(num);
            }
        };
    }
    Runnable runner = new Runnable() {
        @Override
        public void run() {
            System.out.println("Runnable이 구현된 익명 클래스 변수");
        }
    };
}
public class AnonymousInnerTest {
    public static void main(String [] args) {
        Outter2 a = new Outter2();
        Runnable b = a.getRunnable(10);
        b.run();
        a.runner.run();
    }
}

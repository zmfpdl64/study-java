package 내부클래스_람다식_스트림.인스턴스내부클래스;

class Outter {
    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(int i) {
        int num = 100;

        class MyRunnable implements Runnable {
            int localNum = 10;
            @Override
            public void run() {
                System.out.println("i = " + i); //지역변수인데도 불구하고 두번째 호출할때도 메모리에 값이 저장되어있다.
                System.out.println("num = " + num);
                System.out.println("local Num " + localNum);
                System.out.println("outNum =" + outNum + "(외부 클래스 인스턴스 변수)");
                System.out.println("Outter.SNum =" + sNum + "(외부 클래스 정적 변수)");
            }
            
        }
        return new MyRunnable();
    }
}

public class LocalInnerTest {
    public static void main(String [] args) {
        Outter out = new Outter();
        Runnable runner = out.getRunnable(10);
        runner.run();
    }
}

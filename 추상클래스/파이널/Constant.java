package 추상클래스.파이널;

public class Constant {
    int num = 10;
    final int NUM = 100;

    public static void main(String [] args) {
        Constant a = new Constant();
        a.num = 60;
        // a.NUM = 200;

        System.out.println(a.num);
        System.out.println(a.NUM);
        System.out.println(Define.MAX);
    }
}

package 인터페이스.계산기;

public interface Calc {
    double PI = 3.14;   //public static final형
    int ERROR = -9999999;

    default void description() {
        System.out.println("정수 계산기를 구현합니다.");
        myMethod();
    }

    static int total(int[] arr) {   //static메서드는 객체로 사용해야 사용이 가능하다.
        int total = 0;
        for(int i : arr) {
            total += i;
        }
        mystaticMethod();
        return total;
    }

    private void myMethod() {
        System.out.println("Private 메소드입니다.");
    }
    private static void mystaticMethod() {
        System.out.println("Private static 메소드입니다.");
    }

    int add(int x, int y);  //public abstract형 
    int sub(int x, int y);
    int time(int x, int y);
    //곱하기
    int div(int x, int y);
    //나누기
}

package 인터페이스.계산기;

public interface Calc {
    double PI = 3.14;
    int ERROR = -9999999;

    int add(int x, int y);
    int sub(int x, int y);
    int time(int x, int y);
    //곱하기
    int div(int x, int y);
    //나누기
}

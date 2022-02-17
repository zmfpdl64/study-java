package 인터페이스.계산기;

public class CompleteCalc2 extends Calculator{

    @Override
    public int time(int x, int y) {
        return x*y*2;
    }

    @Override
    public int div(int x, int y) {
        return x/y/2;
    }
    
}

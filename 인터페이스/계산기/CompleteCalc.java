package 인터페이스.계산기;

public class CompleteCalc extends Calculator{

    @Override
    public int time(int x, int y) {
        return x * y;
    }

    @Override
    public int div(int x, int y) {
        if( (x == 0) || (y == 0) ){
            return Calc.ERROR;
        }
        else
            return x / y;
    }
    public void showinfo() {
        System.out.println("Calc 인터페이스를 구현하였습니다.");
    }   
}

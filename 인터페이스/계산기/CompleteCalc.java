package 인터페이스.계산기;

public class CompleteCalc extends Calculator{

    @Override
    public int time(int x, int y) {
        return x * y;
    }

    @Override
    public void description() { //인터페이스에서 디폴트 메서드는 재정의할때 public으로 재정의해야 한다.
        super.description();    //super는 상속에 사용할 수 있다. 구현에서는 사용할 수 없다.
        System.out.println("Calc1 계산기");
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

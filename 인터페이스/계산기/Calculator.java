package 인터페이스.계산기;

public abstract class Calculator implements Calc {
    @Override
    public int add(int x, int y){
        return x + y;
    }
    @Override
    public int sub(int x, int y) {
        return x - y;
    }
    
}

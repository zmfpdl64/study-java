package 내부클래스_람다식_스트림.문제풀이;

public class CalcTest {
    public static void main (String [] args) {
        Calc a = new Calc() {
            public int add(int num1, int num2){
                return num1 + num2;
            }
        };
        Calc b = (s, v) -> {return s+v;};
        
        System.out.println(b.add(10,20));
        System.out.println(a.add(10, 20));
        System.out.println(returnCalc().add(10, 20));
    }
    public static Calc returnCalc() {
        Calc c = (s, v) -> {return s+v;};
        return c;
    }
}

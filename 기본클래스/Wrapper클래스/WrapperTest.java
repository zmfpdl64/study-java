package 기본클래스.Wrapper클래스;

public class WrapperTest {
    public static void main (String [] args ) {
        Integer a = new Integer(100);
        int b = a.intValue();

        System.out.println(a);
        System.out.println(b);
        System.out.println(Integer.valueOf("100"));
        System.out.println(Integer.parseInt("100"));
    }
}

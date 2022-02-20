package 내부클래스_람다식_스트림.람다식;

public class MyNumberTest{
    public static void main(String [] args) {
        myNumber max = (x, y) -> (x >= y) ? x : y;
        System.out.println(max.getMax(10, 20));
    }
    
}

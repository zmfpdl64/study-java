package 내부클래스_람다식_스트림.람다식;

interface PrintString {
    void showString(String str);
}

public class lambdaTest {
    public static void main(String [] args) {
        String hello = new String("Hello");
        PrintString a = s -> System.out.println(s); //인터페이스 함수 구현
        a.showString(hello);  //인터페이스 함수 사용
        showMyString(a);        //함수에서 인터페이스를 매개변수로 받아 함수 사용
        PrintString b = returnString();
        b.showString(hello);
    }
    public static void showMyString(PrintString p) {
        p.showString("hello lambda_2");
    }
    public static PrintString returnString() {
        PrintString a = s -> System.out.println(s + "world");
        return a;
    }
}

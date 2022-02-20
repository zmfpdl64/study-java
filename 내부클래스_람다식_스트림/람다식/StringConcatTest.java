package 내부클래스_람다식_스트림.람다식;

public class StringConcatTest {
    public static void main(String [] args) {
        StringConcatlmpl a = new StringConcatlmpl();    //클래스를 이용한 함수 이용
        String s1 = "Hello";
        String s2 = "World";
        a.makeString(s1, s2);
        StringConcat b = (s, v) -> System.out.println(s+" good "+v);    //람다식을 이용한 함수 이용
        b.makeString(s1, s2);
        StringConcat c = new StringConcat() {   //익명클래스를 이용한 함수 이용
            @Override
            public void makeString(String s1, String s2) {
                System.out.println(s1+" "+s2);
            }
        };
        c.makeString(s1, s2);
    }
}

package 기본클래스.String클래스;
//StringBuilder는 멀티스레드 환경이 아니라면 실행속도가 조금 더 빠르다.
//하지만 문자열의의 변경이 안정적이지 않다.
//StringBuffer는 문자열의 변경이 안정적이지만 실행속도가 조금 느리다.
//멀티스레드 환경에서는 StringBuffer가 더 효율적으로 작동한다.
public class StringBuilderTest {
    public static void main(String [] args) {
        String javastr = new String("java");
        System.out.println("javaStr 문자열 주소: "+ System.identityHashCode(javastr));

        StringBuilder buffer = new StringBuilder(javastr);  //StringBuilder는 문자열을 연장할 때 새로 생성하지않고 연장한다.
        //String은 final형이지만 Stringbuilder는 아니기 때문에 변경이 가능하다.
        System.out.println("연산 전 buffer 메모리 주소:" + System.identityHashCode(buffer));

        buffer.append(" and");
        buffer.append(" android");
        buffer.append(" programming is fun!!!");
        System.out.println("연산 후 buffer 메모리 주소:"+ System.identityHashCode(buffer));
        System.out.println(buffer);


        javastr = buffer.toString();
        System.out.println(javastr);
        System.out.println("연결된 javastr 문자열 주소: "+ System.identityHashCode(javastr));
        System.out.println(javastr);
    }
}

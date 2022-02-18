package 기본클래스.String클래스;

public class StringTest2 {
    public static void main(String [] args) {
        String javastr = new String("java");
        String andoridstr = new String("android");
        System.out.println(javastr);
        System.out.println("처음 문자열 주소 값: "+ System.identityHashCode(javastr));

        javastr = javastr.concat(andoridstr);
        System.out.println(javastr);
        System.out.println("연결된 문자열 주소 값: "+ System.identityHashCode(javastr));
        //두 문자열을 연결할 때 기존 배열에서 연장하는게 아니라 새로운 배열을 생성하여 저장한다.
        System.out.println(andoridstr);
        System.out.println("안드로이드 문자열 주소 값: "+ System.identityHashCode(andoridstr));
    }
}

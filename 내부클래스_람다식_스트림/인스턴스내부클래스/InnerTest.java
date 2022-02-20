package 내부클래스_람다식_스트림.인스턴스내부클래스;

class OutClass {
    private int num = 10;
    private static int sNum = 20;

    private InClass inclass ;

    public OutClass() {
        inclass = new InClass();
    }

    class InClass {
        int inNum = 100;
        //static int sInNum = 200;  //내부클래스에서는 정적 변수, 함수를 사용할 수 없다.
        //하지만 내부클래스에서 정적 변수, 함수를 사용하고 싶으면 class를 static 클래스로 정의하면 된다.

        void inTest() {
            System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
            System.out.println("OuClass sNum = " + sNum +"(외부 클래스의 정적 변수)");
        }
    }
    public void usingClass() {
        inclass.inTest();
    }
}

public class InnerTest {    
    public static void main(String [] args) {
        OutClass a = new OutClass();
        System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출가능");
        a.usingClass();
    }
}

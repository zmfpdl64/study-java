package 인터페이스.계산기;
//인터페이스을 사용할 때는 그 클래스를 상속받고싶지는 않지만 기능만을 가지고 싶을 때
//인터페이스를 이용하여 기능만을 모아놓고 사용하고 싶은 클래스에서 인터페이스를 사용한다.
//인터페이스는 여러개 동시 상속이 가능하다.
public class CalcTest {
    public static void main(String [] args) {
        int x = 10, y = 5;
        //Calcu e  = new Calcu1();
        // System.out.println(e.div(x, y));     //인터페이스를 사용하지 않고 업캐스팅했을 때 하위 클래스에서 있던
        //div time 메소드를 사용할 수 없었다.
        CompleteCalc a = new CompleteCalc();
        Calc g = new CompleteCalc2();
        System.out.println("============Calc1===========");
        System.out.println(a.add(x, y));
        System.out.println(a.sub(x, y));
        System.out.println(a.time(x, y));
        System.out.println(a.div(x, y));
        a.showinfo();


        System.out.println("============Calc2===========");
        System.out.println(g.time(x, y));
        System.out.println(g.div(x, y));
        System.out.println("=========Calc1 업캐스트========");
        Calc b = a;
        Calculator c = new CompleteCalc();
        System.out.println(c.add(x, y));
        System.out.println(b.div(x, y));    //인터페이스에서 정의되어 있던 add, sub, time, div메소드를
        //Calculator에서 add, sub를 구현했다. 다시 CompleteCalc에서 상속받아 time, div 메소드를 구현하였다.
        //여기서 CompleteCalc에서 업캐스팅을 통해 Calculaotr로 형변환한 후 time, div를 실행해 보면 실행이 된다.
        //이유는 인터페이스에서 선언해두었던 add, sub, time, div를 어딘가에서 implements를 통해 재정의했다면
        //재정의한 함수를 사용할 수 있다.
        
        //인터페이스를 구현한 클래스에서 일부만 구현하고 다른 클래스가 상속받아 남은 메서드를 모두 구현한다면
        //같은 계열의 상속이라면 인터페이스에 존재하는 메소드를 공유한다.
    }
    
}

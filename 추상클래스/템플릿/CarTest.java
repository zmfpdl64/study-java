package 추상클래스.템플릿;

public class CarTest {
    public static void main(String [] args) {
        AICar a = new AICar();
        ManualCar b = new ManualCar();
        System.out.println("===========AI===========");
        a.run();
        System.out.println("===========사람==========");
        b.run();
        
    }
}

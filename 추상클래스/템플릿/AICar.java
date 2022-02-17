package 추상클래스.템플릿;

public class AICar extends Car {

    @Override
    public void drive() {
        System.out.println("AI가 운전중입니다.");        
    }

    @Override
    public void stop() {
        System.out.println("AI가 멈췄습니다.");        
    }
    
}

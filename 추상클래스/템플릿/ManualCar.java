package 추상클래스.템플릿;

public class ManualCar extends Car{

    @Override
    public void drive() {
        System.out.println("사람이 운전중입니다.");        
    }

    @Override
    public void stop() {
        System.out.println("사람이 멈췄습니다.");        
    }
    
}

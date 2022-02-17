package 추상클래스.템플릿.템플릿메서드;

public class BeginnerLevel extends PlayerLevel {

    @Override
    public void run() {
        System.out.println("달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("점프 못 합니다.");        
    }

    @Override
    public void turn() {
        System.out.println("돌 수 없습니다.");        
    }

    @Override
    public void showLevelMessage() {
        System.out.println("==========초보자 레벨 입니다.==========");
    }
    
}

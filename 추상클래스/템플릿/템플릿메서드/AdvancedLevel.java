package 추상클래스.템플릿.템플릿메서드;

public class AdvancedLevel extends PlayerLevel{

    @Override
    public void run() {
        System.out.println("달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("점프합니다.");        
    }

    @Override
    public void turn() {
        System.out.println("돌 수 없습니다.");        
    }

    @Override
    public void showLevelMessage() {
        System.out.println("==========중급자 레벨 입니다.==========");
    }
    
}

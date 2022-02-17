package 추상클래스.템플릿.템플릿메서드;

public abstract class PlayerLevel {
    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    public abstract void showLevelMessage();

    final public void go(int count) {   //이 클래스를 상속받은 클래스는 다 사용하기 때문에 final 예약어를 넣어 고정했다.
        run();
        for(int i = 0; i < count; i++) {
            jump();
        }
        turn();
    }
}

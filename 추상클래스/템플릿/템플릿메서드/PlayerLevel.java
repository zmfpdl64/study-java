package 추상클래스.템플릿.템플릿메서드;

public abstract class PlayerLevel {
    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    public abstract void showLevelMessage();

    final public void go(int count) {
        run();
        for(int i = 0; i < count; i++) {
            jump();
        }
        turn();
    }
}

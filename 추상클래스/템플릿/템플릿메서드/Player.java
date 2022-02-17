package 추상클래스.템플릿.템플릿메서드;

public class Player {
    private PlayerLevel level;

    public Player() {
        level = new BeginnerLevel();
        level.showLevelMessage();
    }
    public PlayerLevel getLevel() {
        return level;
    }
    public void upgradeLevel(PlayerLevel level) {   //부모클래스로 자식 클래스를 받아서 클래스를 변환시킬 수 있다.
        this.level = level;
        this.level.showLevelMessage();
    }
    public void play(int count) {
        level.go(count);
    }

}

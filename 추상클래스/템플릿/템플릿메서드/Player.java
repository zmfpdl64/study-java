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
    public void upgradeLevel(PlayerLevel level) {
        level.showLevelMessage();
        this.level = level;
        this.level.showLevelMessage();
    }
    public void play(int count) {
        level.go(count);
    }

}

package 추상클래스.템플릿.템플릿메서드;

public class PlayerTest {
    public static void main(String [] args) {
        Player player = new Player();
        player.play(1);

        AdvancedLevel b = new AdvancedLevel();
        player.upgradeLevel(b);
        player.play(2);

        SuperLevel c = new SuperLevel();
        player.upgradeLevel(c);
        player.play(3);
    }
}

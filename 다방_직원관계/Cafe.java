package 다방_직원관계;

public class Cafe {
    public String name;
    public int americano;
    public int latte;
    public int money;
    public Cafe(String name, int ame, int latte, int money) {
        this.name = name;
        this.americano = ame;
        this.latte = latte;
        this.money = money;
    }
    public void print_info() {
        System.out.println(name +"은 " +  money + " 벌었습니다.");
    }
}

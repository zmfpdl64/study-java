package 다방_직원관계;

public class Employee {
    public String name;
    public int money;

    public Employee(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void payame(Cafe cafe) {
        cafe.money += cafe.americano;
        this.money -= cafe.americano;
    }
    public void paylat(Cafe cafe) {
        cafe.money += cafe.latte;
        this.money -= cafe.latte;
    }
    public void print_info() {
        System.out.println(name+"은 " + money + " 남았습니다.");
    }
    
}

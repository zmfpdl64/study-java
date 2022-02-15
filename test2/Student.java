package test2;

public class Student {
    public String name;
    public int grade;
    public int money;

    public Student(String name, int money){
        this.name = name;
        this.money = money;
    }

    public void takeBus(Bus bus) {
        bus.take(1100);
        this.money -= 1000;
    }

    public void takeSubway(Subway subway) {
        subway.take(1250);
        this.money -= 1250;
    }

    public void chargemoney(int money) {
        this.money += money;
    }

    public void studentinfo() {
        System.out.println(name +"님의 남은 잔액은 "+ money +"입니다");
    }
}

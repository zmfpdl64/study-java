package test2;

public class Subway {
    int subnum;
    int money;
    int passengercount;

    public Subway(int subnum) {
        this.subnum = subnum;
    }

    public void take(int money) {
        this.money += money;
        passengercount++;
    }

    public void subwayinfo() {
        System.out.println(this.subnum +"번 지하철이 태운 손님의 수는" + passengercount + "입니다" + "지금까지 번 금액은: " + this.money + "입니다.");
    }
    
}

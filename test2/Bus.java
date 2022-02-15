package test2;

public class Bus {
    int busnum;
    int passengercount;
    int money;

    public Bus(int busnum){
        this.busnum = busnum;
    }

    public void take(int money) {
        this.money += money;
        passengercount++;
    }
    public void businfo() {
        System.out.println("버스 " + busnum + "번의 승객은 " + passengercount +"명이고" + "수입은 " + money + "입니다.");
    }
}

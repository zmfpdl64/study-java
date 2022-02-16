package 상속;

public class Customer {
    protected int memid;    //protected는 상속하는 클래스에서도 접근이 가능할 수 있게해주는 접근제어자이다.
    protected String name;
    protected static int membernum = 1;
    int grade;
    double bonuspoint;
    double bonusratio;

    public Customer() {
        this.memid = membernum++;
        this.grade = 1;
        this.bonusratio = 0.01;
    }
    public Customer(String name) {
        this.name = name;
        this.memid = membernum++;
        this.grade = 1;
        this.bonusratio = 0.01;
    }
    public int calcPrice(int price) {
        this.bonuspoint += price * this.bonusratio;
        return price;
    }

    public String info() {
        return memid + " " +name+"님의 등급은 " + grade + "이며 보너스 포인트는 " + bonuspoint + "입니다.";
    }
    public static void main (String [] args) {
        Customer a = new Customer();
    }
}


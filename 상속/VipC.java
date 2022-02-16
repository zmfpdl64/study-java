package 상속;

public class VipC extends Customer {
    private double saleratio;
    public VipC() {
        super();
        grade = 4;
        bonusratio = 0.05;
        saleratio = 0.1;
    }
    public VipC(String name) {
        super(name);
        grade = 4;
        bonusratio = 0.05;
        saleratio = 0.1;        
    }
    @Override   //부모클래스의 함수를 재정의하여 사용하지 않는다면 오류가 발생하게된다.
    public int calcPrice(int price) {
        this.bonuspoint += this.bonusratio * price;
        return (int)(price - this.saleratio * price);
    }
    public static void main(String [] args) {
        VipC a = new VipC("woojin");
        Customer b = new Customer("bin");
        System.out.println(a.info());
        System.out.println(b.info());
        System.out.println("제품의 가격은 " + 10000 + "원 이며" + "지불해야할 금액은 " + a.calcPrice(10000) + "입니다");
        System.out.println("제품의 가격은 " + 10000 + "원 이며" + "지불해야할 금액은 " + b.calcPrice(10000) + "입니다");
    }
}
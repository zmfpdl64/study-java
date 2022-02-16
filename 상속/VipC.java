package 상속;

public class VipC extends Customer {
    private double saleratio;
    public VipC() {
        grade = 4;
        bonusratio = 0.05;
        saleratio = 0.1;
    }
    public static void main(String [] args) {
        VipC a = new VipC();
        a.name = "woojin";
        System.out.println(a.info());
    }
}
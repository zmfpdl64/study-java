package 인터페이스.다중인터페이스;

public class Customer implements Buy, Sell{

    @Override
    public void sell() {
        System.out.println("물품을 구매하기");        
    }

    @Override
    public void buy() {
        System.out.println("물품을 팔기");        
    }
    @Override
    public void order() {
        System.out.println("소비자 판매자 둘다 주문하세요");
    }
    public static void main(String [] args) {
        Customer a = new Customer();
        Sell seller = a;
        Buy buyer = a;
        a.sell();
        a.buy();
        seller.sell();
        seller.order();
        buyer.buy();
        buyer.order();
        Customer b = null;
        if( seller instanceof Customer) {
            b = (Customer)seller;
            b.buy();
            b.sell();
            
        }
        b.order();
    }
}

package 인터페이스.다중인터페이스;

public interface Sell {
    void sell();
    default void order() {
        System.out.println("판매자 주문하세요");
    }
}

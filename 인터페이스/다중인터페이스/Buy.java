package 인터페이스.다중인터페이스;

public interface Buy {
    void buy();
    default void order() {
        System.out.println("소비자 주문하세요");
    }
}

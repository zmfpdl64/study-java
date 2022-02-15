package 배열;
import java.util.ArrayList;
public class ArrayListTest {
    public static void main(String [] args) {
        ArrayList<Book> a = new ArrayList<Book>();

        a.add(new Book("태맥산맥", "조정래"));
        a.add(new Book("데미안", "헤르만 헤세"));
        a.add(new Book("어떻게 살것인가", "유시민"));
        a.add(new Book("치킨먹고싶다", "이우진"));

        for(int i = 0; i < a.size(); i++) { //ArrayList형은 length 메서드말고 size메서드를 사용한다.
            Book book = a.get(i);   //여기서도 인덱스로 접근하지 않고 get함수로 접근한다.
            book.showBookinfo();
        }

        System.out.println("\n\n=== 향상된 for문 사용 ===");
        for(Book book: a) { //위에서 번거로움이 존재하기 때문에 리스트를 book변수에 반복적으로 담아 실행한다.
            book.showBookinfo();    //인덱스로 접근할때는 사용하기 어렵다..
        }
    }
}

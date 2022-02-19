package 컬렉션프레임워크.컬렉션프레임워크.링크드리스트;
import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String [] args) {
        LinkedList<Object> mylist = new LinkedList<Object>();

        mylist.add("a");
        mylist.add(new LinkedListTest());
        mylist.add("b");
        mylist.add("c");
        mylist.add(5);

        System.out.println(mylist);
        for (Object b : mylist) {
            if( b instanceof String) {
                System.out.println(b);
            } 
        }
        mylist.add(1, "d");
        System.out.println(mylist);
        mylist.addFirst("0");
        System.out.println(mylist);
        System.out.println(mylist.removeLast());
        System.out.println(mylist);

    }
}

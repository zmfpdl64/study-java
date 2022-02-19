package 컬렉션프레임워크.컬렉션프레임워크.콜렉션어레이리스트;
import java.util.ArrayList;
class myStack {
    private ArrayList<Object> arraystack = new ArrayList<Object>();

    public void push(Object a) {
        this.arraystack.add(a);
    }
    public Object pop() {
        int len = arraystack.size();
        if(len == 0) {
            System.out.println("스택이 비었습니다");
            return null;
        }
        return (arraystack.remove(len-1));
    }
    public void print_stack() {
        for(Object a: arraystack) {
            System.out.print(a);
        }
        System.out.println();
    }
}

public class StackTest {
    public static void main(String [] args) {
        myStack a = new myStack();
        a.push("a");
        a.push("b");
        a.push("c");
        a.print_stack();

        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.pop());
        a.print_stack();

    }
}

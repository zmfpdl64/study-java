package 컬렉션프레임워크.컬렉션프레임워크.콜렉션어레이리스트;

import java.util.ArrayList;

class Myqueue {
    private ArrayList<Object> arrayQueue = new ArrayList<Object>();

    public void enQueue(Object data) {
        arrayQueue.add(data);
    }
    public Object deQueue() {
        int len = arrayQueue.size();
        if(len == 0) {
            System.out.println("큐가 비었습니다.");
            return null;
        }
        return (arrayQueue.remove(0));

    }
    public void print_Queue() {
        System.out.println(arrayQueue);
    }
}

public class QueueTest {
    public static void main(String [] args) {
        Myqueue a = new Myqueue();
        a.enQueue("a");
        a.enQueue("b");
        a.enQueue("c");
        a.print_Queue();
        a.deQueue();
        a.print_Queue();
    }
}

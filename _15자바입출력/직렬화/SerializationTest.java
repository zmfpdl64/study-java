package _15자바입출력.직렬화;

import java.io.*;

class Person implements Serializable {  //ObjectInputStream, OutputStream을 사용할려면 사용하는 객체에 implements를 구현해야한다.
    private static final long serialversionid = -12141244124125L;
    String name;
    transient String job;

    public Person() {

    }
    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String toString() {
        return name + "," + job;
    }
}

public class SerializationTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        Person a = new Person("a", "대표이사");
        Person b = new Person("b", "상무이사");
        try(FileOutputStream c = new FileOutputStream("serial.txt");
            ObjectOutputStream d = new ObjectOutputStream(c)) {
                d.writeObject(a);
                d.writeObject(b);
            } catch(IOException e) {
                System.out.println(e);
            }
        try(FileInputStream c = new FileInputStream("serial.txt");
            ObjectInputStream d = new ObjectInputStream(c)) {
                Person p1 = (Person)d.readObject();
                Person p2 = (Person)d.readObject();
                System.out.println(p1);
                System.out.println(p2);
            } catch(IOException | ClassNotFoundException e) {
                System.out.println(e);
            }
    }
}

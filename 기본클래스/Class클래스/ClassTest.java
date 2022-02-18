package 기본클래스.Class클래스;

public class ClassTest {
    public static void main(String [] args) throws ClassNotFoundException {
        Person a = new Person();
        Class a1 = a.getClass();
        System.out.println(a1.getName());

        Class b = Person.class;
        System.out.println(b.getName());

        Class c = Class.forName("기본클래스.Class클래스.ClassTest");
        System.out.println(c.getName());
    }
}


package test;

public class People {
    int age;
    String name ;
    Boolean marry;
    int child;

    public void info1() {
        if (marry)
            System.out.println("나이가 " + age + "이름이 " + name + "결혼을 했고 자식이" + child +"있습니다");
        else
            System.out.println("나이가 " + age + "이름이 " + name + "결혼을 안했고 자식이 없습니다.");
    }
    public static void main(String [] args) {
        People a = new People();
        a.age = 25;
        a.name = "woojin";
        a.marry = false;
        a.child = 3;
        a.info1();
        System.out.println("hello");

        PersonTest b = new PersonTest("이우진", 123456789, 70);
        b.info();
        b.chname("woojin");
        b.info();
    }
}

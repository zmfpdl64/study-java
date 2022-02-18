package 기본클래스.Class클래스;

public class Person {
    private String name;
    private int age;

    public Person() {

    }
    public Person(String name) {
        this.name = name;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getname () {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public int getage() {
        return age;
    }
    public void setage(int age) {
        this.age = age;
    }
}

package 내부클래스_람다식_스트림.스트림;

public class TravelCustomer {
    private String name;
    private int age;
    private int price;

    public TravelCustomer(String name, int age, int price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public int getPrice() {
        return this.price;
    }

    public String toString() {
        return "name: "+name+"age: "+age +"price: "+price;
    }
}

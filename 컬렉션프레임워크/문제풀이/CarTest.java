package 컬렉션프레임워크.문제풀이;

import java.util.Comparator;
import java.util.HashMap;

class Car implements Comparable<Car>{
    String name;
    public Car() {}
    public Car(String name) {
        this.name = name;
    }
    public String getname() {
        return this.name;
    }
    @Override
    public String toString() {
        return this.name;
    }
    @Override
    public int compareTo(Car o) {
        return this.name.compareTo(o.name);
    }


}

public class CarTest {
    public static void main(String [] args) {
        // CarFactory factory = new CarFactory();
        // CarFactory factory = CarFactory.getinstance(); 이렇게 인스턴스를 생성했지만 실제로 생성되지 않아 오류가 발생하였다.
        //위에 방식을 해결하기 위해서는 getInstance함수에 CarFactory함수를 불러서 생성하는 방법이 있다.
        CarFactory factory = CarFactory.getInstance();
        System.out.println(factory);
        Car sonata1 = factory.addcar("연수 차");
        Car sonata2 = factory.addcar("연수 차1");   
        System.out.println(sonata1 == sonata2);

        Car avante1 = factory.addcar("승연 차");
        Car avante2 = factory.addcar("승연 차1");
        System.out.println(avante1 == avante2);

        System.out.println(sonata1 == avante2);
        factory.show_all();
    }

    
}

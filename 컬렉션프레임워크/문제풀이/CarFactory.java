package 컬렉션프레임워크.문제풀이;

import java.util.HashMap;
import 컬렉션프레임워크.문제풀이.Car;
import java.util.Iterator;

public class CarFactory {
    private HashMap<String, Car> hashMap;
    public static CarFactory getInstance() {
        return (new CarFactory());
    }


    public CarFactory() {
        hashMap = new HashMap<String, Car>();
    }
    public Car addcar(String name) {
        Car car = new Car(name);
        hashMap.put(name, car);
        return car;
    }
    public boolean removecar(String name) {
        if(hashMap.containsKey(name)) {
            hashMap.remove(name);
            return true;
        }
        System.out.println(name+"이 없습니다");
        return false;
    }
    public void show_all() {
        System.out.println(hashMap);
    }
}

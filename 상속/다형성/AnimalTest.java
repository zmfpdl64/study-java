package 상속.다형성;
import java.util.ArrayList;
class Animal {
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal {
    public void move() {
        System.out.println("사람이 두발로 걷습니다.");
    }
}

class Tiger extends Animal {
    public void move() {
        System.out.println("호랑이가 네발로 걷습니다.");
    }
}

class Eagle extends Animal {
    public void move() {
        System.out.println("독수리가 하늘을 납니다.");
    }
}

public class AnimalTest {
    public static void main(String [] args) {
        AnimalTest a = new AnimalTest();
        // ArrayList<Animal> aniList = new ArrayList<Animal>();
        // aniList.add(new Human());
        // aniList.add(new Tiger());
        // aniList.add(new Eagle());
        // aniList.add(new Animal());
        Animal b = new Human();     //작은 값으로 형변환
        
        a.moveAnimal(new Human());
        a.moveAnimal(new Tiger());
        a.moveAnimal(new Eagle());
        a.moveAnimal(new Animal());
        a.moveAnimal(b);
        if (b instanceof Human) {       //직전 클래스가 Human 이었는가?
            Human human = (Human)b ;    //다운캐스트
            human.move();       
        }
        // System.out.println(h instanceof Animal);
        // for(Animal ani : aniList) {
        //     ani.move();
        // }

    }
    public void moveAnimal(Animal animal) {
        animal.move();
    }
}
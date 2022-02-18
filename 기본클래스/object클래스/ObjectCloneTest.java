package 기본클래스.object클래스;

class Point {
    int x;
    int y;

    Point (int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "x = " + x + "," + "y = " + y;
    }
}

class Circle implements Cloneable {
    Point point;
    int radius;

    Circle(int x, int y, int radius) {
        this.radius = radius;
        point = new Point(x, y);
    }
    public String toString() {
        return "원점은 " + point + "이고," + "반지름은 " + radius + "입니다";
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}


public class ObjectCloneTest {
    public static void main(String [] args) throws CloneNotSupportedException {
        Circle a = new Circle(10, 20, 30);
        Circle ac = (Circle)a.clone();
        System.out.println(a);
        System.out.println(ac);
        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(ac));
    }
}

package 컬렉션프레임워크.제네릭;

public class Point<T, V> {
    T x;
    V y;
    public Point (T x, V y) {
        this.x = x;
        this.y = y;
    }
    public T getX() {
        return this.x;
    }
    public V getY() {
        return this.y;
    }
}

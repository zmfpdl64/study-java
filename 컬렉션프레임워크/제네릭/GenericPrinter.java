package 컬렉션프레임워크.제네릭;

public class GenericPrinter<T extends Material> {   //Material을 상속받지않은 클래스가 오면 오류가 발생한다.
    private T material; //실제로 Object형이 아니라 Material형으로 변환된다.

    public void setMaterial(T material) {
        this.material = material;
    }
    public T getMaterial() {
        return this.material;
    }
    public String toString() {
        return this.material.toString();
    }
    public void Printing() {
        this.material.doPrinting();
    }
}

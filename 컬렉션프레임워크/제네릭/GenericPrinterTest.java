package 컬렉션프레임워크.제네릭;

public class GenericPrinterTest {
    public static void main(String [] args) {
        GenericPrinter<Powder> a = new GenericPrinter<Powder>();    //만약 다양한 자료형을 사용하고 싶다면
        //Object 클래스를 사용하여 제네릭 클래스를 지정해주는것이 좋다.

        a.setMaterial(new Powder());
        Powder b = a.getMaterial();
        System.out.println(a);
        a.Printing();

        GenericPrinter<Plastic> c = new GenericPrinter<Plastic>();

        c.setMaterial(new Plastic());
        Plastic d = c.getMaterial();
        System.out.println(c);
        c.Printing();
    }
}

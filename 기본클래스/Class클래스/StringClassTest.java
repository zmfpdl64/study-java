package 기본클래스.Class클래스;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringClassTest {
    public static void main(String [] args) throws ClassNotFoundException {
        Class strClass = Class.forName("java.lang.String");

        Constructor[] a = strClass.getConstructors();
        for( Constructor c : a) {
            System.out.println(c);
        }
        System.out.println();
        Field[] fields = strClass.getFields();
        for(Field c : fields) {
            System.out.println(c);
        }
        System.out.println();
        Method[] d = strClass.getMethods();
        for(Method c : d) {
            System.out.println(c);
        }
    }
}

package 예외처리;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
    public ThrowsException() {
    }
    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException{
        FileInputStream a = new FileInputStream(fileName);
        Class c = Class.forName(className);
        return c;
    }
    public static void main(String [] args) {
        ThrowsException a = new ThrowsException();
        try {
            Class b = a.loadClass("a.txt", "java.lang.String");
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch( ClassNotFoundException e) {
            e.printStackTrace();
        } catch(Exception e) {  //오류의 최상위 클래스이므로 가장 마지막에 예외처리를 해야한다.
            e.printStackTrace();
        }
    }
}

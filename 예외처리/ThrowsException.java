package 예외처리;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
    public ThrowsException() {
    }
    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException{
        System.out.println("이건 실행되고 오류처리하자");
        FileInputStream a = new FileInputStream(fileName);  //여기서 예외처리를 한다.
        System.out.println("파일스트림실행완료?");
        Class c = Class.forName(className);                 //여기서 예외처리를 한다.
        return c;
    }
    public static void main(String [] args) {
        ThrowsException a = new ThrowsException();
        try {
            Class b = a.loadClass("a.txt", "java.lang.String"); //여기 예외처리하지 않고 loadClass로 이동한다음 오류가 발생했을 때 처리한다.
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch( ClassNotFoundException e) {
            e.printStackTrace();
        } catch(Exception e) {  //오류의 최상위 클래스이므로 가장 마지막에 예외처리를 해야한다.
            e.printStackTrace();
        }
    }
}

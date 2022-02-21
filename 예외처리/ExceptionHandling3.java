package 예외처리;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;

public class ExceptionHandling3 {
    public static void main(String [] args) {
        FileInputStream a = null;

        try {
            a = new FileInputStream("a.txt");
        } catch(FileNotFoundException e) {
            System.out.println(e);
            return; //리턴문을 넣어도 항상 finally문은 수행되는것을 볼 수 있다!!
        }
        finally {
            if(a != null) {
                try {
                    a.close();
                } catch(IOException e) {
                    System.out.println(e);
                    e.printStackTrace();
                }
            }
            System.out.println("finally는 항상 수행됩니다.");
        }
        System.out.println("정상적으로 종료 되었습니다.");
    }
}

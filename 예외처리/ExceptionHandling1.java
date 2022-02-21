package 예외처리;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class ExceptionHandling1 {
    public static void main(String [] args) {
        try {
            FileInputStream a = new FileInputStream("a.txt");
            if(a != null) {
                try{
                    a.close();
                } catch(IOException e) {
                    System.out.println(e);
                    e.printStackTrace();
                }
            }
        }catch(FileNotFoundException e) {
            System.out.println(e);
        }
        System.out.println("여기도 수행 됩니다.");
    }
}

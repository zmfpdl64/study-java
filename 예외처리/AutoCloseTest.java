package 예외처리;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
public class AutoCloseTest {
    public static void main(String [] args) {
            //리소스 종료
        // try(AutoCloseObj obj = new AutoCloseObj()){
            
        // } catch(Exception e){
        //     System.out.println("예외 부분입니다");
        // }
            
            //강제 오류 발생 리소스 종료
        // try(AutoCloseObj obj = new AutoCloseObj()) {
        //     throw new Exception();
        // } catch(Exception e) {
        //     System.out.println(e);
        // }

            //향상된 try-with-resource
        AutoCloseObj a = new AutoCloseObj();
        try(a) {
            // throw new FileNotFoundException();
            //try-catch 구문이 종료되면 a인스턴스의 자원이 자동으로 반납된다.
            FileInputStream b = new FileInputStream("a.txt");
            System.out.println("try 실행");
        } catch(FileNotFoundException e) {
            System.out.println(e);
        }
    }
}

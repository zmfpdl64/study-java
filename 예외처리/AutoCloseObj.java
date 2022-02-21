package 예외처리;
import java.io.FileNotFoundException;
import java.io.IOException;
public class AutoCloseObj implements AutoCloseable{

    @Override
    public void close() throws FileNotFoundException {
        System.out.println("리소스가 close()되었습니다.");
        
    }
    
}

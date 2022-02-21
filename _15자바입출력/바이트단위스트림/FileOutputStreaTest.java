package _15자바입출력.바이트단위스트림;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreaTest {
    public static void main(String [] args) throws IOException{
        
        try(FileOutputStream  a = new FileOutputStream("output.txt", true)) {
            a.write(65);
            a.write(66);
            a.write(67);
            a.close();
        } catch(IOException e) {
            System.out.println(e);
        }
        
    }
}

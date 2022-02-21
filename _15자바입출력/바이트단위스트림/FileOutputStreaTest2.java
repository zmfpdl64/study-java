package _15자바입출력.바이트단위스트림;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreaTest2 {
    public static void main(String [] args) throws IOException{
        FileOutputStream a = new FileOutputStream("output.txt", true);
        try(a) {
            byte[] bs = new byte[26];
            byte data = 65;
            for(int i = 0; i < bs.length; i++) {
                bs[i] = data++;
            }
            a.write(bs);
        } catch(IOException e) {
            System.out.println(e);
        }
        System.out.println("출력이 완료되었습니다.");
    }
}

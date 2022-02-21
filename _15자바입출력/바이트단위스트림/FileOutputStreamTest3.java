package _15자바입출력.바이트단위스트림;

import java.io.*;

public class FileOutputStreamTest3 {
    public static void main(String [] args) throws IOException {
        try(FileOutputStream a = new FileOutputStream("output3.txt")) {
            byte[] bs = new byte[26];
            byte data = 65;
            for(int i = 0; i < bs.length; i++) {
                bs[i] = data++;
            }
            a.write(bs, 2, 10); // index 2번부터 11까지 
        } catch(IOException e) {
            System.out.println(e);
        }
        System.out.println("출력이 완료되었다.");
    }
}

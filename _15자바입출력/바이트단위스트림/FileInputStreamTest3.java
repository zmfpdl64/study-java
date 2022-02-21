package _15자바입출력.바이트단위스트림;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {
    public static void main(String [] args) throws IOException {
        try(FileInputStream a = new FileInputStream("input.txt")) {
            byte[] bs = new byte[10];
            int i;
            while((i = a.read(bs)) != -1) { //i에 출력되는 문자열갯수가 저장된다.
                for(int k = 0; k < i; k++) {

                    System.out.print((char)bs[k]);
                }
                System.out.println(": " + i + "바이트 읽음");
            }
        } catch(IOException e) {
            System.out.println(e);
        }
        System.out.println("end");
    }
}

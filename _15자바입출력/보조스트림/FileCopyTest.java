package _15자바입출력.보조스트림;

import java.io.*;

public class FileCopyTest {
    public static void main(String[] args) throws IOException{
        long millisecond = 0;
        try(FileInputStream a = new FileInputStream("input.txt");
            FileOutputStream b = new FileOutputStream("b.txt")
        ) {
            millisecond = System.currentTimeMillis();
            int i;
            while((i = a.read()) != -1) {
                System.out.println((char)i);
                b.write(i);
            }
            millisecond = System.currentTimeMillis() -  millisecond;
        } catch(IOException e) {
            e.printStackTrace();
        }
        System.out.println("파일 복사하는데 걸리시간은: "+millisecond +"milliseconds 소요되었습니다.");
    }
}

package _15자바입출력.보조스트림;

import java.io.*;

public class BufferedStreamTest {
    public static void main(String[] args) throws IOException{
        long millisecond = 0;
        try(FileInputStream a = new FileInputStream("input.txt");
            FileOutputStream b = new FileOutputStream("b.txt");
            BufferedInputStream c = new BufferedInputStream(a);
            BufferedOutputStream d = new BufferedOutputStream(b)
        )
        {
            int i;
            millisecond = System.currentTimeMillis();
            while((i = c.read()) != -1) {
                System.out.println((char)i);
                d.write(i);
            }
            millisecond = System.currentTimeMillis() - millisecond;

        } catch(IOException e) {
            e.printStackTrace();
        }
        System.out.println(millisecond+"milliseconds 걸렸습니다.");

    }
}

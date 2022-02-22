package _15자바입출력.보조스트림;

import java.io.*;

public class InputStreamReaderTest {
    public static void main (String [] args) throws IOException {
        try(InputStreamReader a = new InputStreamReader(new FileInputStream("reader.txt"), "utf-8")) {
            int i;
            while((i = a.read()) != -1) {
                System.out.print((char)i);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}

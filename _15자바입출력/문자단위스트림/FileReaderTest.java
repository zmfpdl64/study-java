package _15자바입출력.문자단위스트림;

import java.io.*;

public class FileReaderTest {
    public static void main(String [] args) throws IOException{
        try{
            FileInputStream b = new FileInputStream("reader.txt");
            InputStreamReader fr = new InputStreamReader(b, "utf-8");
            int i;
            while((i = fr.read()) != -1) {
                System.out.print((char)i);
            }
        } catch(IOException e) {
            System.out.println(e);
        }
        System.out.println("end");
    }
}

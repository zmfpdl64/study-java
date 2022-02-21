package _15자바입출력.문자단위스트림;

import java.io.*;

public class FileWriterTest {
    public static void main(String [] args) throws IOException{
        try(OutputStreamWriter a = new OutputStreamWriter(new FileOutputStream("writer.txt", true), "utf-8")) {
            a.write('a');
            char buf[] = {'b', 'c', 'd', 'e', 'f'};

            a.write(buf);
            a.write("값을 입력할게요");
            a.write(buf, 1, 2);
            a.write("65");
        } catch(IOException e) {
            System.out.println(e);
        }
        System.out.println("end");
    }
}

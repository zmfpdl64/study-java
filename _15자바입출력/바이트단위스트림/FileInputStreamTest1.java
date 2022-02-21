package _15자바입출력.바이트단위스트림;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;
import java.io.*;

public class FileInputStreamTest1 {
    public static void main(String[] args) {
        FileInputStream a = null;

        try {
            a = new FileInputStream("input.txt");
            int i;
            while((i = a.read()) != (-1) ){ //eof가 -1이다.
                System.out.print((char)i);
            }
        } catch (IOException e) {
            System.out.println(e);
            // e.printStackTrace();
        } finally {
            try {
                a.close();
            } catch(IOException e) {
                System.out.println(e);
            } catch( NullPointerException e) {
                System.out.println(e);
            }
        }
        System.out.println("end");
    }
}

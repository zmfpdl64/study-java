package _15자바입출력.그외입출력클래스;

import java.io.*;

public class FileTest {
    public static void main(String[] args) throws IOException{
        File file = new File("_15자바입출력/그외입출력클래스/newFile.txt");
        file.createNewFile();

        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());

        file.delete();
    }
}

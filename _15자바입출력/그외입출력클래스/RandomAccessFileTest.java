package _15자바입출력.그외입출력클래스;

import java.io.*;

public class RandomAccessFileTest {
    public static void main(String[] args) throws IOException{
        RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
        rf.writeInt(100);
        System.out.println("파일 포인터 위치" + rf.getFilePointer());
        rf.writeDouble(3.14D);
        System.out.println("파일 포인터 위치" + rf.getFilePointer());
        rf.writeUTF("안녕하세요");
        System.out.println("파일 포인터 위치:"+ rf.getFilePointer());
        rf.seek(0);
        int i = rf.readInt();
        double d = rf.readDouble();
        String str = rf.readUTF();

        System.out.println("파일 포인터 위치: "+ rf.getFilePointer());
        System.out.println(i);
        System.out.println(d);
        System.out.println(str);
    }
}

package _15자바입출력.보조스트림;

import java.io.*;

public class DataStreamTest {
    public static void main(String[] args) throws IOException{
        try(FileOutputStream a = new FileOutputStream("input.txt");
            DataOutputStream b = new DataOutputStream(a))
            {
                b.writeByte(100);
                b.writeChar('A');
                b.writeInt(10);
                b.writeFloat(3.14f);
                b.writeDouble(3.14D);

            } catch(IOException e) {
                e.printStackTrace();
            }
        try(FileInputStream a = new FileInputStream("input.txt");
            DataInputStream b = new DataInputStream(a)) {

                System.out.println(b.readByte());
                System.out.println(b.readChar());
                System.out.println(b.readInt());
                System.out.println(b.readFloat());
                System.out.println(b.readDouble());
            } catch(IOException e) {
                e.printStackTrace();
            }
    }
}

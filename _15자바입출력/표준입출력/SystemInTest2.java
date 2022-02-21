package _15자바입출력.표준입출력;

import java.io.IOException;

public class SystemInTest2 {
    public static void main(String [] args) throws IOException{
        System.out.println("문자열을 입력하고[Enter]를 누르세요");
        int i;
        try {
            while((i = System.in.read()) != 'q') {
                System.out.println((char)i);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    
}

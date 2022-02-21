package _15자바입출력.표준입출력;

import java.io.Console;

public class ConsoleTest {
    public static void main(String [] args) {
        Console a = System.console();

        System.out.print("아이디를 입력하시오:");
        String name = a.readLine();
        
        System.out.print("비밀번호를 입력하시오:");
        char [] password = a.readPassword();

        System.out.println("아이디가 생성되었습니다.");
        
    }
}

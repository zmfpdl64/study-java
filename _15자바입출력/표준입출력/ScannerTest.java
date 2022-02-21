package _15자바입출력.표준입출력;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름:");
        String name = scanner.nextLine();
        System.out.println("직업: ");
        String job = scanner.nextLine();
        System.out.println("사번:");
        int numid = scanner.nextInt();

        System.out.println(name + "의 직업은 "+ job + "이고 사번은 "+numid + "이다");
    }
}

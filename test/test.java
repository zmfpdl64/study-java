package test;
import java.util.ArrayList;
import java.util.Arrays;    //문자열배열 리스트로 변환
import java.util.Comparator;
public class test {


    public static void main(String[] args) {
        AutoCloseable a = new AutoCloseable() {
            public void close() throws Exception{
                System.out.println("out");
            }
        };
        try(a) {

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}



package test;
import java.util.ArrayList;
import java.util.Arrays;    //문자열배열 리스트로 변환
import java.util.Comparator;
public class test {


    public static void main(String[] args) {
        String data [] = {"123", "456", "789"};
        ArrayList<String> a = new ArrayList<>(Arrays.asList(data));
        String data1;
        data1 = String.join(" ", data);
        a.sort(Comparator.naturalOrder());
        System.out.println(a);
        System.out.println(data1);
        System.out.println(Arrays.asList(data));
    }
}



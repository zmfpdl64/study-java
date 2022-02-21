package 내부클래스_람다식_스트림.스트림;
import java.util.Arrays;

public class intArrayTest {
    public static void main(String [] args) {
        int[] arr = {1,2,3,4,5};

        int sumVal = Arrays.stream(arr).sum();
        int count = (int)Arrays.stream(arr).count();    //count가 long형이므로 int형으로 변환

        System.out.println(sumVal);
        System.out.println(count);
    }
}

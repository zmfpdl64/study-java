package 예외처리;

public class ArrayExceptionHandling {
    public static void main(String [] args) {
        int[] arr = {1,2,3,4,5};
        try {
            for(int i = 0; i <= 5; i++) {
                System.out.println(arr[i]);
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("예외 처리 부분");
        } 
        System.out.println("프로그램 종료");
    }
}

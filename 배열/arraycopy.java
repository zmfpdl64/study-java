package 배열;

public class arraycopy {
    public static void main(String [] args) {
        int [] arr1 = new int[] {1, 2, 3, 4, 5, 6};
        int [] arr2 = new int[] {10, 20, 30, 40, 50};
        
        System.arraycopy(arr2, 0, arr1, 0, 4);
        for(int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}

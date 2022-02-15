package 배열;

public class 다차원배열 {
    public static void main(String [] args) {
        int[][] a = new int[2][3];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++) {
                a[i][j] = (i+1)*(j+1);
                System.out.println(a[i][j]);
            }
        }
    }
}

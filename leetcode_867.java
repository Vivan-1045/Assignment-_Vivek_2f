import java.lang.reflect.Array;
import java.util.Arrays;

public class leetcode_867 {
    public static void main(String[] args) {
       int [][] mat = {{1,8,6}};
        System.out.println((Arrays.deepToString(Mat(mat))));
    }
    public static int[][] Mat(int[][] mat){
        int MaT[][] = new int[mat[0].length][mat.length];
        for (int i = 0; i <mat.length; i++) {
            for (int j = 0; j <mat[0].length; j++) {
                if ((i+j)/2<=mat.length){
                    MaT[j][i] = mat[i][j];
                }
            }
            System.out.println();
        }
        return MaT;
    }
}

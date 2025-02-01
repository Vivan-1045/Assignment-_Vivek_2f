import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class leetcode_496 {
    public static void main(String[] args) {
     int [] a = {2,4};
     int [] b = {1,2,3,4};
        System.out.println(Arrays.toString(Ans(a,b)));
    }

    //brute force
    public static int[] newArray(int[] A, int [] B){
        int[] ans = new int[A.length];
        boolean isPresent = false;
        for (int i = 0;i<A.length;i++) {
            isPresent = false;
            for (int j = 0; j < B.length; j++) {

                if (A[i]==B[j]){
                    isPresent = true;
                }
                if (isPresent && B[j]>A[i]){
                    ans[i] = B[j];
                    break;
                }
            }

        }
        for (int i = 0;i<ans.length;i++){
            if (ans[i]==0){
                ans[i] = -1;
            }

        }
        return ans;
    }

    //Using Stack

    public static int[] Ans(int[] A, int [] B){
        Map<Integer,Integer> mp = new HashMap<>();
        Stack<Integer> stk = new Stack<>();
        int[] ans = new int[A.length];
        //Enter the element in the Map
        for(int i= 0;i<B.length;i++){
            while (!stk.isEmpty() && stk.peek()<B[i]){
                mp.put(stk.pop(),B[i]);
            }
            stk.push(B[i]);
        }
        for(int i : stk){
            mp.put(i,-1);
        }
        for(int i =0;i<A.length;i++){
            ans[i] = mp.get(A[i]);
        }
        return ans;
    }
}

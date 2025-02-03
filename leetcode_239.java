import java.util.ArrayDeque;
import java.util.Arrays;

public class leetcode_239 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,0,5,6,9,4,2,-8,1,2};239
        int k = 3;
        System.out.println(Arrays.toString(res(arr,k)));
    }
    public static int[] res(int [] nums,int k){
        ArrayDeque<Integer> q = new ArrayDeque<>();
        int i=0, j=0, ptr=0;
        int n = nums.length;
        int[] res = new int[n-k+1];

        while(j<n){
            while(!q.isEmpty() && q.peekLast()<nums[j]){
                q.pollLast();
            }

            q.add(nums[j]);

            if(j-i+1<k){
                j++;
            }else if(j-i+1==k){

                res[ptr++] = q.peek();

                if(nums[i]==q.peek()){
                    q.pollFirst();
                }
                i++;
                j++;
            }
        }

        return res;

    }

}

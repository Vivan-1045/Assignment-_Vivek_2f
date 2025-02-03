public class leetcode_1991 {
    public static void main(String[] args) {
        int [] arr = {2,5};
        System.out.println(Middle(arr));
    }
    public static int Middle(int[] arr){
        int rs = 0;
        int ls = 0;
        for (int num: arr) {
            rs += num;
        }
        for (int i = 0;i<arr.length;i++){
            if (i>0){
                ls += arr[i-1];
            }
            rs -= arr[i];
            if (ls==rs){
                return i;
            }
        }
        return -1;
    }
}

public class Finding_Largest_ele {
    public static void main(String[] args) {
        int [] arr={465,98,2,-56,-382,3283};
        int res= Integer.MIN_VALUE;
        for(int i=0; i< arr.length; i++){
            if(arr[i]>res){
                res=arr[i];
            }
        }
        System.out.println(res);
        // REVERSE PRINTING
        for(int r=arr.length-1; r>=0;r--){
            System.out.println(arr[r]);
        }
        // SUM OF ARRAY
        int sum =0;
        for(int p=0; p< arr.length; p++){
             sum +=arr[p];
        }
        System.out.println(sum);
    }
}

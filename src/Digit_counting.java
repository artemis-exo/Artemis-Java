public class Digit_counting {
    public static void main(String[] args) {
        int res=0;
        int n=374634638;
        while(n>0){
            n=n/10;
            res++;
        }
        System.out.println(res);
    }
}

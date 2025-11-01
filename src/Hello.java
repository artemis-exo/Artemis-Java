import java.util.Scanner;

public class Hello {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the  number ");
            int n = sc.nextInt();
            int sum = 0;
            int r;

            while (n >=0) {
                if(n==0 ){
                    n=sum;
                }
                r = n % 10;
                sum = sum + r;
                n = n / 10;
                if(sum<=9){
                    System.out.println(sum);
                    break;
                }
            }
        }

//                if(sum>9){
//                    int u= SumNum(sum);
//                    System.out.println(u);
//                }
//
//            }
//        }
//        static int SumNum(int a){
//            if(a==0){
//                return a;
//            }
//            return a%10 + SumNum(a/10);
//        }
    }



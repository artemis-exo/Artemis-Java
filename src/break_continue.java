public class break_continue {
    public static void main(String[] args) {

//        for(int i=0; i<5;i++){
//            System.out.println(i);
//            System.out.println("Hello heii");
//
//            if(i==3){
//                System.out.println("comieee");
//                break;
        //   }
        // }
//        int i = 0;
//        while (i < 5) {
//            System.out.println(i);
//            System.out.println("HEMIEE");
//
//            if (i == 3) {
//                System.out.println("comieee");
//                break;
//            }
//            i++;
//        }
//        int p = 0;
//        do {
//            System.out.println(p);
//            System.out.println("HEMIEE");
//
//            if (p == 3) {
//                System.out.println("comieee");
//                break;
//            }
//            p++;
//        } while(p<5);
//
        //Continue
        for(int i=0; i<5;i++){

           if(i==3){
             System.out.println("comieee");
                continue;
              }
            System.out.println(i);
            System.out.println("Hello heii");

        }
        int l = 0;
        do {

            if (l == 3) {
                System.out.println("comieee");
                break;
            }
            System.out.println(l);
            System.out.println("HEMIEE");

            l++;
        } while(l<5);
    }
}

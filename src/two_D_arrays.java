public class two_D_arrays {
    public static void main(String[] args) {
//        String [] fruits= {"APPLE","GUAVA","POMEGRANATE"};
//        String [] Vegetables= {"BITTERGUOD","ONION","CARROT"};
//        String [] meats= {"CHICKEN","PORK","MUTTON","FISH"};

        String [][] groceries={{"APPLE","GUAVA","POMEGRANATE"},
                               {"BITTERGUOD","ONION","CARROT"},
                               {"CHICKEN","PORK","MUTTON","FISH"}};
         groceries[1][1]= "POTATO"; // FOR REPLACING
        for(String [] meals : groceries) {// TAKES ROW BUT IT WILL GIVE REFERENCES AS OUTPUT
            for (String meal : meals) { // IT WILL DESIRED OUTPUT
                System.out.print(meal+ " "); // ALL COMES IN ONE LINE
            }
            System.out.println(); //FORMATED WAY SAME AS IN ORIGINAL

//            char [][] template={{'1','2','3'},
//                                {'4','5','6'},
//                                {'7','8','9'},
//                                {'*','0','#'}};
//             for (char[] num: template){ //TAKING A ROW SO WE USE char[]( TO REPRESENT EACH ROW WHILE LOOPING OVER 2D ARRAY)
//                for(char numsie: num){
//                    System.out.print(numsie+ " ");
//                }
//                System.out.println();
           // }
        }
    }
}

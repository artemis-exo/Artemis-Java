

public class array_Sorting_Descending {
    public static void main(String[] args) {
        // FOR DESCENDING ORDER

        // METHOD 1: BUBBLE SORTING
        int [] volley={67,98,45,28,91,24};
        int bubble=0;
        for(int i=0; i<volley.length-1;i++){
            for(int j=0; j<volley.length-1-i; j++){
                if(volley[j]<volley[j+1]){
                    bubble=volley[j];
                    volley[j]=volley[j+1];
                    volley[j+1]=bubble;
                }
            }
        }
        System.out.print("THE SORTED ARRAY IS : ");
        for(int elok: volley){
            System.out.print(elok + " ");
        }
        System.out.println();

        // METHOD2: SELECTION SORTING
        int  [] foil= {89,28,63,84,98};
        int select=0;
        for(int i=0; i<foil.length-1;i++){
            int max=i;
            for(int j=i+1; j<foil.length; j++){
                if(foil[j]>foil[max]){
                    max= j;
                }
            }
            select= foil[max];
            foil[max]=foil[i];
            foil[i]=select;
        }
        System.out.print("THE SORTED ARRAY IS: ");
        for(int femo: foil){
            System.out.print(femo + " ");
        }
        System.out.println();

        // METHOD 3: INSERTATION SORTING
        int [] drip= {56,78,92,45,104};
        for(int i=1; i<drip.length;i++){
            int insert= drip[i];
            int x=i-1;

            while(x>=0 && drip[x]<insert ){
                drip[x+1]=drip[x];
                x--;
            }
            drip[x+1]=insert;
        }
        System.out.print("THE SORTED ARRAY IS: ");
        for (int reli: drip){
            System.out.print(reli + " ");
        }
    }
}

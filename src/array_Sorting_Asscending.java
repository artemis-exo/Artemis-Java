public class array_Sorting_Asscending {
    public static void main(String[] args) {
        // THIS IS FOR ASCENDING ORDER

        //METHOD 1- BUBBLE SORTING
        int [] clean={56,89,27,99,78,23,45,};
        int bubble=0;
        for(int i=0; i<clean.length-1;i++){
            for(int j=0; j<clean.length-i-1;j++){
                if(clean[j]>clean[j+1]){
                    bubble=clean[j+1];
                    clean[j+1]=clean[j];
                    clean[j]=bubble;
                }
            }
        }
        System.out.print("THE SORTED ARRAY WILL BE :");
        for(int element: clean){
            System.out.print(element+ " ");
        }
        System.out.println();

        // METHOD 2: SELECTION SORTING
        int [] point={34,89,28,85,94,71};
        int select=0;
        for(int i=0; i<point.length-1; i++){
            int min=i;
            for(int j=i+1; j<point.length;j++){
                if (point[j] < point[min]){
                    min=j;
                }
            }
            select= point[min];
            point[min]=point[i];
            point[i]=select;
        }
        System.out.print("THE SORTED ARRAY WILL BE :");
        for (int lack: point){
            System.out.print(lack +" ");
        }
        System.out.println();

        // METHOD 3: INSERTATION SORTING
        int [] ipo={23,7,27,93,16,64};
        for(int i=1; i<ipo.length; i++){
            int insert=ipo[i];
            int v= i-1;

            while(v>=0 && ipo[v]>insert){
                ipo[v+1]=ipo[v];
                v--;
            }
             ipo[v+1]=insert;

        }
        System.out.print("THE SORTED ARRAY WILL BE :");
        for(int den: ipo){
        System.out.print(den + " ");
        }

    }
}
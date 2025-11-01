public class array_Questions {
    public static void main(String[] args) {
        // PROBLEM 1
        float [] simp= {78.9f,38.9f, 89.5f,99.2f,104.7f};
        float sum=0;
        for(float eloq: simp){
            sum= sum + eloq;
        }
        System.out.println("THE VALUE OF SUM IS " +sum);

        // PROBLEM 2
        float [] saviour={78.9f,38.9f, 89.5f,99.2f,104.7f,193.8f};
        float numero= 99.25f;
        boolean isINArray= false;
        for(float gills:saviour){
            if(numero==gills) {
                isINArray = true;
                break;
            }
            }  if (isINArray) {
                System.out.println("THE VALUE IS PRESENT IN ARRAY");
            }
            else {
                System.out.println("THE VALUE IS NOT PRESENT IN ARRAY");
            }

            //PROBLEM 3
            float [] physics= {89.9f,90f,77.4f,99.9f,100f};
            float avg=0;
            for(float yolo:physics){
                avg=avg+yolo;
            }
        System.out.println("THE VALUE OF AVERAGE MARKS IS " +avg/physics.length);

            // PROBLEM 4
            int [][] mat1= {{1,2,3},
                             {4,5,6}};
            int [][] mat2= {{2,6,13},
                             {3,7,11}};
            int [][] result ={{0,0,0},
                              {0,0,0}};
            for(int i=0; i<mat1.length; i++){ // ROW NUMBER OF TIMES
                for(int j=0; j<mat1[i].length;j++){ // COLUMN NUMBER OF TIMES
                    System.out.format("SETTING VALUE FOR i=%d and j=%d\n",i,j);
                    result[i][j]=mat1[i][j] + mat2[i][j];
                }
            }
            // PRINTING THE ELEMENTS OF 2D ARRAY
        for(int i=0; i<mat1.length; i++){ // ROW NUMBER OF TIMES
            for(int j=0; j<mat1[i].length;j++){ // COLUMN NUMBER OF TIMES
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        //PRACTICE FOR 4
        int[][] mato1= {{1,2,},
                         {4,5,},
                          {6,7}};
        int [][] mato2= {{2,13},
                         {3,11},
                          {8,9}};
        int [][] resulto ={{0,0},
                            {0,0},
                            {0,0}};
        for(int i=0; i<mato1.length; i++){ // ROW NUMBER OF TIMES
            for(int j=0; j<mato1[i].length;j++){ // COLUMN NUMBER OF TIMES
                System.out.format("SETTING VALUE FOR i=%d and j=%d\n",i,j);
                resulto[i][j]=mato1[i][j] + mato2[i][j];
            }
        }
        // PRINTING THE ELEMENTS OF 2D ARRAY
        for(int i=0; i<mato1.length; i++){ // ROW NUMBER OF TIMES
            for(int j=0; j<mato1[i].length;j++){ // COLUMN NUMBER OF TIMES
                System.out.print(resulto[i][j] + " ");
            }
            System.out.println();
        }
        // PROBLEM 5- REVERSING THE ELEMENTS OF AN ARRAY
        int [] reverse= {4,5,7,9,23,67};
        int l= reverse.length;
         int sep=Math.floorDiv(reverse.length,2); 
         int temp;
         for(int i=0;i<sep; i++){
             // SWAP reverse[i] and reverse[l-i-1]
             temp=reverse[i];
             reverse[i]=reverse[l-1-i];
              reverse[l-1-i]=temp;
         }
         for(int ele: reverse){
                // System.out.print(ele+" ");
         }

         //PROBLEM 6- FINDING THE MAXIMUM NUMBER IN AN ARRAY
        int [] maxi= {4987,5,7,999,23,67};
         int max= 0;
         for(int i=0; i<maxi.length; i++){
             if(maxi[i]>max){
                 max=maxi[i];
             }
         }
        System.out.println("THE VALUE OF THE MAXIMUM ELEMENT IN THIS ARRAY IS "+max);

                      // OR ANOTHER METHOD
        int [] maxio= {400000,5,7668,999,2366,67435};
        int high=0;
        for(int element: maxio){
            if(element>high){
                high=element;
            }
        }
        System.out.println("THE VALUE OF THE MAXIMUM ELEMENT IN THIS ARRAY IS "+ high);

        // PROBLEM 7- FINDING THE MINIMUM NUMBER IN AN ARRAY
        int [] minio= {4,1,7668,999,2366,67435};
        int mac=minio[0];
        for(int p=1;p<minio.length;p++){
            if(minio[p]<mac){
                mac=minio[p];
            }
        }
        System.out.println("THE MINIMUM VALUE OF AN ARRAY IS "+mac);

        // PROBLEM 8
        // CHECKING WHETHER A ARRAY IS SORTED OR NOT
        int [] sort= {678,987,467,895,9463,736,937};
        boolean trip=true;
        for(int i=0; i<sort.length-1;i++){
            if(sort[i]> sort[i+1]){
                trip=false;
                break;
            }
        }
        if(trip){
            System.out.println("THE GIVEN ARRAY IS SORTED ");
        }
        else{
            System.out.println("THE GIVEN ARRAY IS NOT SORTED ");
        }
        // PRACTICE- MATRIX 3X3
        int [][] nato1= {{11,12,13},
                       {14,15,16},
                       {17,18,19}};
        int [][] nato2={{20,21,22},
                        {23,24,25},
                        {26,27,28}};
        int [][] natoR={{0,0,0},
                        {0,0,0},
                        {0,0,0}};
        for(int i=0; i< nato1.length;i++){ // ROW NUMBER OF TIMES
            for(int j=0; j<nato1[i].length;j++){ // COLUMN NUMBER OF TIMES
                System.out.format("SETTING THE VALUE FOR i=%d j=%d\n",i,j);
                natoR[i][j]=nato1[i][j] + nato2[i][j];
            }
        }
        for(int i=0; i< nato1.length;i++){ // ROW NUMBER OF TIMES
            for(int j=0; j<nato1[i].length;j++) { // COLUMN NUMBER OF TIMES
                System.out.print(natoR[i][j] + " ");
            }
            System.out.println();
            }

    }
}

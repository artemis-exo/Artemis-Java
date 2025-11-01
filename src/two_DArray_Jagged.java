public class two_DArray_Jagged {
    public static void main(String[] args) {
        // 3X3 ARRAY
        int [][] arr={{1,2,3},
                      {4,5,6},
                      {7,8,9}};
        for(int i=0; i< arr.length; i++){
            for(int j=0; j< arr.length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        // 3X2 ARRAY
        char ar[][]= new char[3][2];
        ar[0][0]= 'a';
        ar[0][1]= 'b';
        ar[1][0]= 'c';
        ar[1][1]= 'd';
        ar[2][0]= 'e';
        ar[2][1]= 'f';
        for(int i=0; i<ar.length;i++){
            for(int j=0; j<ar[i].length;j++){
                System.out.print(ar[i][j]+ " ");
            }
            System.out.println();
        }
        //JAGGED ARRAY -ARRAY OF ARRAYS OF DIFFERENT LENGTH
        char arc[][]= new char[3][];
        arc[0]=new char[2];
        arc[1]=new char[3];
        arc[2]=new char[2];

        arc[0][0]= 'a';
        arc[0][1]= 'b';
        arc[1][0]= 'c';
        arc[1][1]= 'd';
        arc[1][2]= 'k';
        arc[2][0]= 'e';
        arc[2][1]= 'f';
        for(int u=0; u<arc.length;u++){
            for(int j=0; j<arc[u].length;j++){
                System.out.print(arc[u][j]+ " ");
            }
            System.out.println();
        }
    }
}

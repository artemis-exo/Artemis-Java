public class multidimensional_array {
    public static void main(String[] args) {
        int [][] flats = new int[2][3];
        flats[0][0]= 101;
        flats[0][1]= 102;
        flats[0][2]= 103;
        flats[1][0]= 201;
        flats[1][1]= 202;
        flats[1][2]= 203;

        System.out.println("PRINTING 2D ARRAY USING FOR LOOP");
        for(int i=0; i<flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        String [][][] students= new String[2][3][4];
        students[0][0][0]= "HARRY";
        students[0][0][1]= "LEO";
        students[0][0][2]= "PAGE";
        students[0][0][3]= "EMMA";
        students[0][1][0]= "KRISTIE";
        students[0][1][1]= "ETHAN";
        students[0][1][2]= "BOEYED";
        students[0][1][3]= "SARAH";
        students[0][2][0]= "VICTOR";
        students[0][2][1]= "TOKYO";
        students[0][2][2]= "STOCKHOLM";
        students[0][2][3]= "LISBON";
        students[1][0][0]= "MOSCOW";
        students[1][0][1]= "KENNEY";
        students[1][0][2]= "MELBOURNE";
        students[1][0][3]= "SYDNEY";
        students[1][1][0]= "ADELAIDE";
        students[1][1][1]= "DELHI";
        students[1][1][2]= "MUMBAI";
        students[1][1][3]= "KOLKATA";
        students[1][2][0]= "CHENNAI";
        students[1][2][1]= "DEHRADUN";
        students[1][2][2]= "BRISBANE";
        students[1][2][3]= "PERTH";

        System.out.println("PRINTING 3D ARRAY USING FOR LOOP");
        for(int i=0; i<students.length; i++) {
            for (int j = 0; j < students[i].length; j++) {
                for (int k = 0; k < students[i][j].length; k++) {
                    System.out.print(students[i][j][k]);
                    System.out.print(" ");
                }
                System.out.println();
            }
            System.out.println("------END OF BLOCK " + i + "-----");
        }




    }
}

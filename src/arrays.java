public class arrays {
    public static void main(String[] args) {
        /* Classroom of 500 Students - You have to store marks of these 500 students.
           You have 2 Options :
           1. Create 500 variables
           2. Use Arrays (recommended)
         */
        // There are three ways to create an Array
        // 1. Declaration and them Memory Allocation
        int [] markie;
        markie = new int[5];
   //      2. Declaration and Memory Allocation
    //     Initialization
        int [] marks=new int[5];
        marks[0]=100;
        marks[1]=80;
        marks[2]=68;
        marks[3]=83;
        marks[4]=97;
        //marks[5]=89;  //- throws an error
        System.out.println(marks[4]);

        // 3. Declaration Memory Allocation and Initialization together
         int [] addie={45,78,49,89,78};
        System.out.println(addie[1]);




    }
}

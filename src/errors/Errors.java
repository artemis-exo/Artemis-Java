package errors;

import Access_modifier.school.Student;

public class Errors {
    public static void main(String[] args) {
        int [] numerators={23,45,78,29};
        int [] denominator={1,2,0,4};
        for(int i=0; i< 10;i++){
            try{   // Index out of bound error
            System.out.println(divide(numerators[i],denominator[i]));
            }catch (Exception e){
                System.out.println(e);
            }
        }
        System.out.println("Good Job");
    }
    public static int divide(int a, int b){
        try{
          //  Student student =null;// Exception Handling
          //  System.out.println(student.getClass());
        return a/b;
        }
        catch (NullPointerException e){
            System.out.println("Null pointer exception :(");
            return -1;
        }
        catch(ArithmeticException u){
            System.out.println(u);
            return -1;
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
        catch (Exception e){  // This a parent class
            System.out.println(e);
            return -1;
        }
    }
}

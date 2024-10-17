import java.lang.*;
public class Multicatch{
    public static void main(String args[]){
        try{
            int a=9/0;
            System.out.println(a);
        }
        catch(ArithmeticException ae){
            System.out.println("Arithemetic Exception");
        }
        catch(ArrayIndexOutOfBoundsException aiobe){
            System.out.println("Array index out of Bounce");
        }
    }
}

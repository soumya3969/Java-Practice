
import java.util.*;
public class ExceptionDemoThrows2 {
    static void func(int a,int b) throws ArithmeticException,ArrayIndexOutOfBoundsException{
        System.out.println(10/b);
        int [] arr = {1,2,3};
        System.out.println(arr[b]);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for(int i=0;i<3;i++){
            try{
                func(in.nextInt(),in.nextInt());
            }catch(ArithmeticException e){
                System.out.println("Cant divide by 0");
            }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Out of Bounds");
        }
        }
    }
}

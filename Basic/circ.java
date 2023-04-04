import java.util.*;
class Circle{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the circle radius: ");
        double r = sc.nextInt();
        double p, a;
        p= 3.14*2*r;
        a=3.14*r*r;
        System.out.println("The Parimeter of the Circle is : " +p+ " and area of the Circle is : " +a);
    }


    
}
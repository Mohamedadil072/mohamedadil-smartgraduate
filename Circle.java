import java.util.Scanner;
class Circle{ 
  public static void main(String args[]){ 
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter the radius: "); 
        double radius = Scanner.nextDouble();
        double area = Math.PI * (radius * radius); 
        System.out.println("The area of circle is: " + area);
        double circumference= Math.PI * 2*radius; 
        System.out.println("The circumference of the circle is:"+circumference) ; 
     } 
} 
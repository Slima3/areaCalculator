import java.util.*;
public class MainSl17 {
   public static void main(String [] args){
      
      Scanner console = new Scanner(System.in);
      System.out.println("Which shape you need are for, press 1 for circle, 2 for rectangle or 3 for triangle");
      int shapeid = console.nextInt();
      if (shapeid == 1){
         System.out.println("enter radius of the circle");
         double cradius = console.nextDouble();
         Circle a = new Circle(cradius);
         System.out.println("The area of the circle of radius " + cradius + " is: " + a.getArea());
      }
      
      else if (shapeid== 3){
         System.out.println("enter the length of side 1: ");
         double side1 = console.nextDouble();
         System.out.println("enter the length of side 2: ");
         double side2 = console.nextDouble();
         System.out.println("enter the length of side 3: ");
         double side3 = console.nextDouble();
         Triangle b = new Triangle(side1,side2,side3);
         System.out.println("The area of your Triangle is:" + b.getArea());
     }
     
     else if
     (shapeid == 2){
         System.out.println("enter side 1");
         double rside1 = console.nextDouble();
         System.out.println("enter side 2");
         double rside2 = console.nextDouble();
         Rectangle c = new Rectangle(rside1,rside2);
         System.out.println("The are of the rectangle is:" + c.getArea());
         }
     
      }
      

   }

import java.util.Scanner;
public class Volume{
   public static void main(String[] args){
      Scanner console = new Scanner(System.in);
      System.out.println("Here are your options:");
      System.out.println("1)Volume of cylinder");
      System.out.println("2)Volume of cone");
      System.out.println("3)Volume of cube");
      System.out.println("4)Volume of pyramid ");
      System.out.println("5)Volume of sphere");
      System.out.println("Choose your option:");
      int option = console.nextInt();
      if( option == 1){
         System.out.println("Enter radius");
         double r = console.nextDouble();
         System.out.println("Enter height");
         double h = console.nextDouble();
         Cylinder(r,h);
      }else if( option == 2){
         System.out.println("Enter radius");
         double r = console.nextDouble();
         System.out.println("Enter height");
         double h = console.nextDouble();
         Cone(r,h);
      }else if( option == 4){
         System.out.println("Enter length");
         double l = console.nextDouble();
         System.out.println("Enter height");
         double h = console.nextDouble();
         System.out.println("Enter width");
         double w= console.nextDouble();
         Pyramid(l,w,h);
      }else if( option == 3){
         System.out.println("Enter length");
         double l = console.nextDouble();
                     Cube(l);
      }else if( option == 5){
         System.out.println("Enter length");
         double r = console.nextDouble();
         Sphere(r);
      }else{
         System.out.println("Wrong input");
      }
   }
   public static void Cylinder(double r, double h){
      double vol = (22/7)*Math.pow(r,2)*h;
      System.out.println("Volume of cylinder = "+vol);
   }
   public static void Cone(double r, double h){
      double vol = (22/7)*Math.pow(r,2)*(h/3);
      System.out.println("Volume of cone = "+vol);
   }
   public static void Cube(double l){
      double vol = Math.pow(l,3);
      System.out.println("Volume of cube = "+vol);
   }
   public static void Pyramid(double l, double h, double w){
      double vol = (l*w*h)/3;
      System.out.println("Volume of pyramid = "+vol);
   }
   public static void Sphere(double r){
      double vol = 4/3*(22/7)*Math.pow(r,3);
      System.out.println("Volume of sphere = "+vol);
   }
}



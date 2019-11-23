import java.util.Scanner;
public class fibonacci{
   public static void main(String[] args){
      Scanner console = new Scanner(System.in);
      System.out.println("Enter number of terms you want in the series");
      int terms = console.nextInt();
      fibonacciseries(terms);
   }
   public static void fibonacciseries(int terms){
      int a = 0;
      int b = 1;
      System.out.print( a + " " + b + " ");
      int c = 0;
      for(int i =  1; i<= terms; i++){
         c = a + b;
         System.out.print (c + " ");
         a = b;
         b = c;
              }
    }
}

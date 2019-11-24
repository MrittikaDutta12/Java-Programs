  import java.util.Scanner;
  public class Pyramidright{
  public static void main(String[] args){
      Scanner console = new Scanner(System.in);
      System.out.println(" Hello, enter desired size of pyramid");
      int size = console.nextInt();
      drawpyramid(size);
   }
   public static void drawpyramid( int size){
      for(int i = 0; i< size; i++){
       
         for(int j = 0; j<=i; j++){
            System.out.print("*");
         }
         System.out.println();
      }
   }
}
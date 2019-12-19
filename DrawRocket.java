// Mrittika Dutta
// First Period
// AP Computer Science A
// Rocketship - Project 2.6
public class DrawRocket{
   public static final int SIZE=3;
   public static void main(String[]args1){
      
      //This method prints the head of the rocket
      rocketHead();
      
      //This prints the line that separates the head, the top section and the bottom section from each other4
      sectionDivider();
      
      //This prints the space to provide room for the section divider and the top section 
      System.out.println();
      
      //This prints the top section of the middle body of the rocket
      topSection();
      
      //This prints the bottom section of the middle body of the rocket
      bottomSection();
      
      //This time the section divider separates the bottom section from the next time the bottom section is reprinted.
      //This forms the second half of the body
      sectionDivider();
      
      //space for bottom section
      System.out.println();
      
      //bottom section forms the first part of the second portion of the middle body
      bottomSection();
      
      //top section forms the second part of the second portion of the middle body
      topSection();
      
      //This prints the section divider 
      sectionDivider();
      
      //space for the top of the rocket head to fit
      System.out.println();
      
      //the rocket head is printed which now forms the tail of the rocket 
      rocketHead();
      
      //this prints space marking the end of the rocket
      System.out.println();        
   }
   
   //This method prints the head of the rocket
   public static void rocketHead(){
   
      //The relationship between total number of rows and size
      int totalrow = 2*SIZE - 1;
      
      //The relationship between total number of colums and size
      int totalcol = 4*SIZE + 2;
      
      //This loop prints the head of the rocket 
      for( int everyrowofpyramidhead = 0; everyrowofpyramidhead <totalrow; everyrowofpyramidhead ++){
      
         //this stores the total number of stars in the rocket head
         int totalstarCount =2 *( everyrowofpyramidhead+1) - 2 ;
         
         //This stores the stars in each side
         int starsoneachside = totalstarCount/2;
         
         //this variabe stores the total no of spaces in the head of the rocket
         int totalSpaceCount = totalcol - 6 - totalstarCount;
         
         //This stores the spaces on eachside
         int spacesoneachside = totalSpaceCount/2;
         
         //This prints the number of spaces involved in the left side
         for (int space=0; space<spacesoneachside ; space++){
            System.out.print(" ");
         }
         
         //this prints the */ sign which is at the end on the left side of the pyramd
         System.out.print("*/");
         
         //This loop prints the stars on the left side of the pyramid head 
         for (int starsonleft=0; starsonleft<starsoneachside ; starsonleft++){
            System.out.print("*");
         }   
         
         //This prints the pipe which forms the constant central pattern of the pyramid irrespective of the value of size.
         System.out.print("||");
         
         //This loop prints the stars on the right side of the pyramid head
         for (int starsonright=0; starsonright<starsoneachside; starsonright++){
            System.out.print("*");
         }
         
         //this prints the */ sign which is at the end on the left side of the pyramd
            System.out.print("\\*");
         
         //This loop prints the spaces on the right  
         for (int spaces=0; spaces<spacesoneachside; spaces++){
            System.out.print(" ");
         }
          
         //This prints space to indicate the beginning of a new line 
         System.out.println();
      
      }
      
   }
   
    //This prints the top section of the middle body of the rocket
   public static void topSection(){
   
      //This loop prints the three lines of pattern of the top portion of the middle body of the rocket
      for (int line = 1; line <= SIZE; line++) {
      
         //this prints the | sign which begins the pattern
         System.out.print("|");
         
         //This loop prints the dots on the left side of the middle body of the rocket
         for(int dotsonleft = SIZE - line; dotsonleft>= 1; dotsonleft--){
            System.out.print(".");
         }
         
         //This loop prints the inverted Vs on each line
         for(int invertedv = 1; invertedv <= SIZE; invertedv++){
            System.out.print("/\\");
         }
         //This prints the forward slash at the end of the inverted Vs pattern
         System.out.print("/");
         
          //This loop prints the dots on the right side of the middle part of the body of the rocket
         for(int dotsonright= SIZE+line; dotsonright>1;dotsonright--){
            System.out.print(".");
         }
         
         //This prints the | at the end of the pattern line
         System.out.print("|");
         
         //Prints the space at the end of the line for the next line to  fit properly
         System.out.println();
      }
   }
   
   //This prints the bottom section of the middle part of the  body of the rocket
   public static void bottomSection(){
   
      //This loop prints the three lines of pattern of the bottom portion of the middle body of the rocket
      for(int line = 1; line<=SIZE; line++){
         System.out.print("|");
         
         //This loop prints the dots on the left side of thetop portion of the middle body of the rocket
         for(int dotsonleft= 1; dotsonleft< line;dotsonleft++){
            System.out.print(".");
         }
         
         //This loop prints the upright Vs on each line
         for(int uprightv = SIZE; uprightv>= 1; uprightv--){
            System.out.print("\\/");
         }
         
         //This prints the backward slash which ends the pattern of upright Vs on each line
         System.out.print("\\");
         
         //This loop prints the dots on the right side of the pattern of the mid body,
         for(int dotsonright = 2*SIZE-line; dotsonright>= 1 ;dotsonright--){
            System.out.print(".");
         }
      
         //This prints the | at the end of the pattern line
         System.out.print("|");
         
         //Prints the space at the end of the line for the next line to  fit properly
         System.out.println();
      }
      
   }
   
   //This prints the line that separates the head, the top section and the bottom section from each other
   public static void sectionDivider(){
      
      //This variable stores the total number dashes in the section divider
      int totalnumofdashes = 4*SIZE-8;
      
      //This varibale stores the dashes on each side
      int dashesoneachside = totalnumofdashes/2;
      
      //This prints the +--^ patterns that begins the section divider 
      System.out.print("+--^");
      
      //This loop prints the dashes on the left side of the section divider 
      for(int numofdashesleft = 1; numofdashesleft<= dashesoneachside; numofdashesleft++){
         System.out.print("-");
      }
      
      //This prints the two carets which is constant for any size of the rocket
      System.out.print("^^");
      
      //This loop prints the dashes on the right side of the section divider 
      for(int numofdashesright = 1; numofdashesright<= dashesoneachside ;numofdashesright++){
         System.out.print("-");
      }
      
     //This prints the ^--+ patterns that ends the section divider
      System.out.print("^--+");  
   
   }

}
      



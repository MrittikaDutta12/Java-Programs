import java.util.Scanner;
public class Ves{
	public static void main(String[] args){
    Scanner console = new Scanner(System.in);
		System.out.println(" Hi! Enter three sides");
		double a = console.nextDouble();
		double b = console.nextDouble();
      double c = console.nextDouble();
     if ( Pytho(a,b,c)== true){
     	System.out.println(" Your triangle is a right angled triangle");
     }else if( Equi(a,b,c)== true){
     	System.out.println("Your triangle is an equilateral triangle");
     }else if( Scalene(a,b,c)== true){
     	System.out.println("Your triangle is an scalene triangle");
     }else if( Isosceles(a,b,c)== true){
     	System.out.println("Your triangle is an isosceles triangle");
     }else{
     	System.out.println(" Wrong Input");
     }

	}
	public static boolean Pytho(double a, double b, double c){
		if ( Math.sqrt((a*a) + (b*b))== c || Math.sqrt((c*c) + (b*b))== a || Math.sqrt((c*c) + (a*a))==b ){
		 return true;
			}else{
      return false;
      }
 }	
	public static boolean Equi(double a, double b, double c){
		if ( a==b && b==c && c==a ){
		 return true;
		}else{
       return false;
       }
      }
	public static boolean Scalene(double a, double b, double c){
		if ( a!=b && b!=c && a!=c ){
		 return true;
		}else{
       return false;
            }
      }
	public static boolean Isosceles(double a, double b, double c){
		if ( a == b && a !=c || c == b && b!= a || a == c && c != b){
			return true;
		 }else{
        return false;
             }
		}			
}
import java.util.Scanner;
public class retirement{
public static void main(String[] args){
Scanner console = new Scanner(System.in);
System.out.println(" Hello enter your age");
int age = console.nextInt();
Age(age);
}
public static void Age(int age){
int years = 60 - age;
System.out.println(" You have "+years +" years until you retire");
}
}
import java.util.*;
public class Experiment{
public static void main(String[] args){
Scanner sc =  new Scanner(System.in);
int a= sc.nextInt(); 
int b = sc.nextInt();
    if (a * 2 < b) {
        a = a * 3;
    }
    if (b < a) {
        b++;
    } else {
        a--;
    }
    System.out.println(a + " " + b);
}
}
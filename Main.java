import java.util.Scanner;
public class Main {
 public static void main (String[] args) {
	 Scanner in =new Scanner(System.in);
	 int n=in.nextInt();
	 System.out.println("Odd is ");
	 for(int i=1;i<=n;i=i+2) {
		 
	  System.out.println(i);
	 }
	
	 System.out.println("Even is "); 
	 for(int i=2;i<=n;i=i+2) {
		 
		 System.out.println(i); 
	 }
	
	
 }
}

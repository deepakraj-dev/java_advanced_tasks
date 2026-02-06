import java.util.Scanner;

public class Arrays1D {
    public static void main(String[] args) {
    	Scanner in=new Scanner(System.in);
    	System.out.println("Enter the size");
    	int size=in.nextInt();
    	int[] arr=new int[size];
    	int sum=1;
    	System.out.println("Enter the Array value");
    	for(int i=0;i<size;i++) {
    		arr[i]=in.nextInt();
    		
    	}	
    	for(int i=0;i<size;i++) {
    		 sum*=arr[i];
    		//System.out.println(arr[i]);
    		}
    	System.out.println(sum);
   }
}

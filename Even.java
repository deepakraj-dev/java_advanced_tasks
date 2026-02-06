
public class Even {
	public static void main(String[] args) {
		int a=10;
		int sum=0;
		int sum1=0;
		System.out.println("Sum of Odd ");
		for(int i=1;i<=a;i=i+2) {
			sum1+=i;
		}
		
		System.out.println(sum1);			 
		
		 
		System.out.println("Sum of Even "); 
		for(int i=2;i<=a;i=i+2) {
								 
		 sum+=i;
		}
		System.out.println(sum);
				
	}

}

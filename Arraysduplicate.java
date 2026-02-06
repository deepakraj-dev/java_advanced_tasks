public class Arraysduplicate

{
	public static void main(String[] args) {
		int arr[] = {1,12,3,41,5};
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
		    for(int j=0;j<arr.length;j++)
		    {
		        if(i!=j)
		        {
		        if (arr[j]>arr[i])
		        {
		            count++;
		        }
		           System.out.print(arr[i]+","+arr[j]+"  ");
		        }
		    }
		    System.out.println("count = "+count);
		    count=0;
		}
	}
}

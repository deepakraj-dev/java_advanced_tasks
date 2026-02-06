import java.util.*;
public class Arrays2D {

	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int size=5;
	int[][] arr=new int [size][size];
	for(int row=0;row<size;row++) {
		for(int col=0;col<size;col++) {
			arr[row][col]=in.nextInt();
		}
	}
	for(int row=0;row<size;row++) {
		for(int col=0;col<size;col++) {
			if(row==col)
			System.out.println(arr[row][col]);
		}
	}
	for(int row=0;row<size;row++) {
		for(int col=0;col<size;col++) {
			if(row+col==size-1)
			System.out.println(arr[row][col]);
		}
	}
}
}

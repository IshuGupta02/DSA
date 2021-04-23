import java.util.Scanner;
import java.util.Arrays;

class BinarySearch{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		int x=sc.nextInt();
		
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			
		}
		
		Arrays.sort(arr);
		
		//binary search--not a good attempt
		
		/* int start=0;
		int end=arr.length-1;
		
		while(arr[(start+end)/2]!=x){
			
			if(start>=end){
				System.out.println("Number not found");
				return;
			}
			if(arr[(start+end)/2]>x){
				end=(start+end)/2-1;
				
				
			}
			else{
				
				start=(start+end)/2+1;
				
			}
			
		}
		
		int index=(start+end)/2;
		System.out.println(index);
		 */
		 
		 //binary search--2nd attempt
		 
		 
		int start=0;
		int end=arr.length-1;
		
		while(start<=end){
			if(arr[(start+end)/2]==x){
				System.out.println((start+end)/2);
				return;
				
			}
			
			else if(arr[(start+end)/2]>x){
				end=(start+end)/2-1;
				
				
			}
			
			else if(arr[(start+end)/2]<x){
				start=(start+end)/2+1;
				
			}
			
			
		}
		
		System.out.println("Not Found");
		return;
		 
		
	}

}
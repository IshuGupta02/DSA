import java.util.Scanner;
import java.util.Arrays;

class DynamicArray{
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
		
		
	}
	

}

class Darr<T>{
	T[] array= new T[5];
	int buffer=5;
	int filled=0;

	
	void add(T obj){
		if(buffer>0){
			array[filled]=obj;
			buffer--;
		}
		else{
			buffer+=array.length;
			T[] newarr=new T[buffer+array.length];
			copy(array, newarr);
			
			newarr[array.length]=obj;
			buffer--;	
				
			array=newarr;
			System.gc();
			
			
		}
		
		
		
	}
	void remove(){
		
		
		
	}
	
	static void copy(T[] ar1, T[] ar2){
		for(int i=0;i<ar1.length;i++){
			ar2[i]=ar1[i];
			
		}
		
		
		
	}
	
	
}
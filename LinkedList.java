class LinkedList<T>{
	//T data;
	node head<T>;
	node tail<T>;
	
	LinkedList(){
		head= new node<T>;
		tail=head;
		
	}
	LinkedList(T obj){
		head= new node<T>;
		head.data=obj;
		tail=head;
	}
	
	void add(T obj){
		node newobj<T>=new newobj<T>;
		newobj.data=obj;
		tail.pointer=newobj;
		tail=newobj;
		
		
	}
	
	void remove(T obj){
		node<T> sample=head;
		
		if(sample.data==obj){
			head=sample.pointer;
			
		}
		else{
			while(sample.pointer!=null&&sample.pointer.data!=obj){
				sample=sample.pointer;
				
			}
			
			if(sample.pointer!=null&&sample.pointer.data==obj){
				if(sample.pointer.pointer==null){
					sample.pointer=sample.pointer.pointer;
					tail=sample;
				}
				else{
					sample.pointer=sample.pointer.pointer;
				}
				
			}
			
			
		}
		
		/* while(sample.data!=obj&&sample.pointer!=null){
			sample=sample.pointer;
			
			
			
		}
		if(sample.data==obj){
			
			
		} */
		
		
	}
	
	
}



class node<T>{
	T data;
	node pointer=null;
		
}



class MainClass{

	public static void main(String args[]){
		
		
	}
	
	
}
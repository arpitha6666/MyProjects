package test.collections;

public class StackImpl_ArrayList {
	int size;
	int arr[];
	int top;
	
	public StackImpl_ArrayList(int size) {
		this.size= size;
		this.arr = new int[size];
		this.top=-1;
	}

	public Boolean isFull() {
		return(size-1==top); //return true if the stack is full ie.,if the top is at the last index of the arraylist
		
	}
	
	public Boolean isEmpty() {
		return(top==-1);//return true if the stack is empty i.e., if the top is pointing at the -1 index of the arryalist
		//(as top is initialized to -1 in constructor)
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		StackImpl_ArrayList obj = new StackImpl_ArrayList(10);
		
	}

}

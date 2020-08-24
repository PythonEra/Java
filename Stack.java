
public class Stack {
private int arr[];
private int top;
private int capacity;

//creating a statck
Stack(int size){
	arr = new int[size];
	capacity = size;
	top = -1;
}

//Add elements into stack
public void push(int x) {
	if (isFull()) {
		System.out.println("OverFlow\nPrgram Terminated\n");
		System.exit(1);
	}
	System.out.println("Inserting "+x);
	arr[++top]= x;
	
}

//Remove element from stack
public int pop() {
	if(isEmpty()) {
		System.out.println("Stack Empty");
		System.exit(1);
	}
	return arr[top--];
}
public boolean isEmpty() {
	return top == -1;
}
public boolean isFull() {
	return top == capacity-1;
}
public void printStack() {
	for (int i=0;i<=top;i++) {
		System.out.println(arr[i]);
	}
}
public static void main(String[] args) {
	Stack stack = new Stack(5);
	
	stack.push(1);
	stack.push(2);
	stack.push(3);
	
	stack.pop();
	System.out.println("\nAfter poping");
	stack.printStack();
	
}
}

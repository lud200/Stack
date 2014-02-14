package stack;

public class stack {
	public static final int MAX_INT=9;
	public static void main(String args[]){
		stacks s1=new stacks();
		stacks s2=new stacks();
		stacks s3=new stacks();
		for(int i=0;i<(MAX_INT-1)/3;i++){
			s1.push(i);
		}
		s1.push(4);
		s1.push(5);
		s1.push(6);
		System.out.println("Stack 1:");
		s1.print();
		for(int i=(MAX_INT-1)/3; i<2*(MAX_INT-1)/3; i++){
			s2.push(i);
		}
		s2.push(4);
		s2.push(9);
		s2.push(10);
		System.out.println("Stack 2:");
		s2.print();
		for(int i=2*(MAX_INT-1)/3; i<(MAX_INT-1); i++){
			s3.push(i);
		}
		System.out.println("Stack 3:");
		s3.print();
	}
}

class stacks{
	public final int MAX_INT=9;
	int stack[]=new int[MAX_INT];
	int top;
	stacks(){
		top=-1;
	}
	public void stackEmpty(){
		System.out.println("Empty Stack");
	}
	public void stackFull(){
		System.out.println("Stack is full");
	}
	public void push(int n){
		if(top==MAX_INT/3){
			stackFull();
		}
		else{
			top=top+1;
			stack[top]=n;
		}
	}
	public int pop(){
		if(top==-1){
			stackEmpty();
		}
		else{
			stack[top]=stack[top-1];
			top=top-1;
		}
		return stack[top];
	}
	public void print(){
		for(int i=0; i<=top;i++){
			System.out.println(stack[i]);
		}
	}
}

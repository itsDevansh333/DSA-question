package practice;

import java.util.Scanner;

public class Stack {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the stack");
		int n=sc.nextInt();
		int[] stack=new int[n];
		int top=-1;
		int ch=-1;
		System.out.println("Enter 1 to push");
		System.out.println("Enter 2 to pop");
		System.out.println("Enter 3 to display");
		System.out.println("Enter 4 to exit");
		Stack s1=new Stack();
		while(ch!=4) {
			System.out.print("Enter your choice: ");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.print("Enter the data: ");
				int data=sc.nextInt();
				s1.push(stack, data, top);
				break;
			case 2:
				s1.pop(stack, top);
				break;
			case 3:
				s1.display(stack, top);
				break;
			case 4:
				ch=4;
			default:
				System.out.println("invalid input");
			
			}
		
		}
	}
	int push(int[] stack,int data, int top) {
		if(top==stack.length-1) {
			System.out.println("Stack overflow");
			return top;
		}
		top++;
		stack[top]=data;
		return top;
	}
	int pop(int[] stack,int top) {
		if(top==-1) {
			System.out.println("Stack underflow");
			return top;
		}
		top--;
		return top;
	}
	void display(int[] stack,int top) {
		for(int i=top;i>=0;i--) {
			System.out.print(stack[i]+" ");
		}
	}
}

package practice;

import java.util.Scanner;

public class Queue {
	Scanner scan=new Scanner(System.in);
	int front=-1,rear=-1;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the queue");
		int n=sc.nextInt();
		int[] queue=new int[n];
//		int front=-1,rear=-1;
		System.out.println("Enter 1 to Enqueue");
		System.out.println("Enter 2 to Dequeue");
		System.out.println("Enter 3 to display");
		System.out.println("Enter 4 to exit");
		int ch=0;
		Queue q1=new Queue();
		while(ch!=4) {
			System.out.print("Enter your choice: ");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				q1.Enqueue(queue, n);
				break;
			case 2:
				q1.dequeue(queue, n);
				break;
			case 3:
				q1.display(queue);
				break;
			case 4:
				ch=4;
				break;
			default:
				System.out.println("invalid input");
			
			}
		
	}
	}
	int[] Enqueue(int[] queue,int n) {
		if(rear==n-1) {
			System.out.println("Queue overflow");
			return queue;
		}
		System.out.print("Enter the data: ");
		int data=scan.nextInt();
		if(front==-1&&rear==-1) {
			front=0;
			rear=0;
		}
		else {
			rear++;
		}
		queue[rear]=data;
		return queue;
	}
	void dequeue(int[] queue,int n) {
		if(front==-1) {
			System.out.println("Queue underflow");
//			return queue;
		}
		if(rear<front) {
			rear=-1;front=-1;
		}
		else {
			front++;
		}
	}
	void display(int[] queue) {
		for(int i=front;i<=rear;i++) {
			System.out.print(queue[i]+" ");
		}
		System.out.println();
	}
}

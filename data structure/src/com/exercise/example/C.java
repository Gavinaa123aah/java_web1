package com.exercise.example;

public class C {

	public C() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node<Integer> head = null;
		Node<Integer> tail = null;
		
		head = new Node("node1");
		tail = head;
		//�����½ڵ� ͬʱ�����һ���ڵ���������
		tail.next = new Node("node1data2");
		//β�ڵ�ָ���µĽڵ�
		tail = tail.next;
		tail.next = new Node("node1data3");
		tail = tail.next;
		
		Node<Integer> current = head;
		//�������
//		while (current!=null) {
//			System.out.println(current.item);
//		    current = current.next;			
//		}

		
		
		current.printListRev(head);
	}
	
	


}

class Node<E>{
	E item;
	Node<E> next;
	
	public Node(E element) {
		// TODO Auto-generated constructor stub
		this.item = element;
		this.next = null;
		
	}
	
	void printListRev(Node<E> head) {
	//�������������Ҫ���˵ݹ��˼��
	    if (head != null) {
	        printListRev(head.next);
	        System.out.println(head.item);
	    }
	}
}

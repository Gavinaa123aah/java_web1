package com.exercise.example;

import java.util.LinkedList;

public class MyStack<E> {

	public MyStack() {
		// TODO Auto-generated constructor stub
	}
	
	private LinkedList<E> list = new LinkedList<>();
	
	//��վ
	public void enter(E e) {
		
		list.addLast(e);
	}
	//��ս
	public E delete() {
		
		System.out.println(list.getLast());
		return list.removeLast();
		
	}
}

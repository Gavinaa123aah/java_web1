package com.exercise.example;

import java.util.LinkedList;

public class MyQueue <E>{

	public MyQueue() {
		// TODO Auto-generated constructor stub
	}
	private LinkedList<E> list = new LinkedList<>();
	
	
	//���
	public void enterQueue(E e) {
		list.addLast(e);
	}
	//����
	public E deleteQueue() {
		return list.removeFirst();
	}
}

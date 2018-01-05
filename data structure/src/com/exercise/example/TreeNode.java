package com.exercise.example;

public class TreeNode<E> {
	
    E element;
    TreeNode<E> left;
    TreeNode<E> right;
    
	public TreeNode(E e) {
		// TODO Auto-generated constructor stub
		this.element  = e;
	}
	
	//�������
	protected void preorder(TreeNode<E> root) {
		if (root == null)
	        return;
		
		System.out.println(root.element + "  ");
		
		preorder(root.left);
		
		preorder(root.right);
	}
	
	//�������
	protected void inorder(TreeNode<E> root) {

	    if (root == null)
	        return;

	    inorder(root.left);

	    System.out.println(root.element + " ");

	    inorder(root.right);
	}

	//��������
	protected void postorder(TreeNode<E> root) {

	    if (root == null)
	        return;

	    postorder(root.left);

	    postorder(root.right);

	    System.out.println(root.element + " ");
	}

	
}

package com.sndr.impl.tree.binary;

import com.sndr.impl.tree.Node;
public class BinaryTree<Type> {

	Node<Type> root;
	BinaryTree(){
		root = null;
	} 
	
	BinaryTree(Type item){
		root = new Node<Type>(item);
	}
	
	public static void main(String[] args){
		
		BinaryTree<String> tree=new BinaryTree<String>("root");
		
		tree.root.setLeft("left");
		tree.root.setRight("right");
		
		Node<String> left=tree.root.getLeft();
		Node<String> right=tree.root.getRight();
		
		left.setLeft("nested left");
		right.setRight("nested right");
		
		System.out.println(tree.root);
		System.out.println(left);
		System.out.println(right);
		
		System.out.println(right.getRight());
		System.out.println(left.getLeft());
		
		System.out.println(left.getRight());
		System.out.println(right.getLeft());
		
	}
}

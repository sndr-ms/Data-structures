package com.sndr.impl.tree;

import com.sndr.service.NodeService;

public class Node<Type> implements NodeService<Type> {

	private Type item;
	private Node<Type> left,right;
	
	public Node(Type item){
		this.item=item;
		left = right = null;
	}
	
	public void setLeft(Type item){
		
		left = new Node<Type>(item);
		left.left=left.right=null;
	}
	
	public Node<Type> getLeft(){
		return this.left;
	}
	
	public void setRight(Type item){
		
		right=new Node<Type>(item);
		right.left=right.right=null;
		
	}
	
	public Node<Type> getRight(){
		
		return this.right;
	}
	
	@Override
	public String toString(){
		
		return this.item.toString();
	}
}

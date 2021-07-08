package com.sndr.service;

public interface NodeService<Type> {

	public void setLeft(Type item);
	public Object getLeft();
	public void setRight(Type item);
	public Object getRight();
}

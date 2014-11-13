/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1;

import java.util.*;

/**
 *
 * @author User
 */
class GLinkedList<E>{
	private Node<E> head = null;//empty list
	private int size = 0;
	public void add(E x){ //add at head
		Node<E> nw = new Node<E>(x);
		nw.setNext(head);
		head = nw;
		size++;
	}

	public boolean contains(E x){
		Node<E> k = head;
		boolean found = false;
		while(k != null && !found){
			E kk = k.data();
			if(kk.equals(x)) found = true;
			else k = k.next();
		}
		return found;
	}

	public void remove(E x){
		Node<E> k = head; Node<E> bk = head;
		boolean found = false;
		while(k != null && !found){
			if(k.data().equals(x)) found = true;
			else{ bk = k; k = k.next();}
		}
		if(found)
			if(k == head)
				head = k.next();
			else
			  bk.setNext(k.next());
	}

	public int length(){
		return size;
	}
	public void display(){
		Node<E> k = head;
		System.out.print('[');
		while(k != null){
			if(k.next != null)
			   System.out.print(k.data()+", ");
			else
			   System.out.print(k.data());
			k = k.next();
		}
		System.out.println(']');
	}
	public Iterator<E> iterator(){
		return new GIterator<E>(head, size);
	}
	private static class GIterator<E> implements Iterator<E>{
		private Node <E> head;
		private int size;
		private int index = 0;
		GIterator(Node<E> h, int s){
			head = h; size = s;
		}
		public boolean hasNext(){
			return index < size;
		}
		public E next(){
			if(index == size) throw new NoSuchElementException();
			E item = head.data();
			head = head.next(); index++;
			return item;
		}
		public void remove(){}
	}
}


public class Node<E>{
	E data;
	Node<E> next;
	public Node(E  x){
		data = x; next = null;
	}
	public Node<E> next(){return next;}
	public void setNext(Node<E> p){
		next = p;
	}
	public void set(E x){data = x;}
	public E data(){return data;}
}


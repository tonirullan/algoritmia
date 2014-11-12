/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1;

/**
 *
 * @author User
 */
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


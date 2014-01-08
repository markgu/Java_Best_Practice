package collections;

import java.util.ArrayList;

import collections.LinkedList.Node;


public class LinkedListLoop {

	public static void main(String[] args){
		LinkedList ll = new LinkedList();
		LinkedList.Node head = ll.head();
		Node loopNode = new LinkedList.Node("3");
		ll.add(new LinkedList.Node("1"));
		ll.add(new LinkedList.Node("2"));
		ll.add(loopNode);
		ll.add(new LinkedList.Node("4"));
		ll.add(new LinkedList.Node("5"));
		ll.add(loopNode);
		
		LinkedList.Node current = head;
		
		ArrayList<Node> ar = new ArrayList<Node>();
		boolean loop = false;
		while(current.next() != null){
			if(ar.contains(current)) {
				loop = true;
				break;
			}
			ar.add(current);			
			current = current.next();			
		}
		
		System.out.println("LinkedList contains Loop? " + loop);

	}

}

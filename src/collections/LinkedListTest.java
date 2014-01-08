package collections;

public class LinkedListTest {

	public static void main(String[] args){
		LinkedList linkedList = new LinkedList();
		linkedList.add(new LinkedList.Node("1"));
		linkedList.add(new LinkedList.Node("2"));
		linkedList.add(new LinkedList.Node("3"));
		linkedList.add(new LinkedList.Node("4"));
		linkedList.add(new LinkedList.Node("5"));
		linkedList.add(new LinkedList.Node("6"));
						
		System.out.println("LinkedList: " + linkedList.toString());
		System.out.println("length of LinkedList: " + linkedList.size());
	    System.out.println("middle element of LinkedList : " + linkedList.findMiddleNode());

	}
	 

}

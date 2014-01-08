package collections;

class LinkedList{
	private Node head;
	private Node tail;
	
	public LinkedList(){
		this.head = new Node("head");
		tail = head;
	}	
	public Node head(){
		return head;
	}
	
	public void add(Node node){
		tail.next = node;
		tail = node;
	}
	
	public Node findMiddleNode(){
		Node head = this.head();		
		Node current = head;
		int length = 0;
		Node middle = head;
		
		while(current != null){
			length++;
			if(length % 2 == 0){
				middle = middle.next();
			}
			current = current.next();			
		}
		return middle;
	}
	
	public int size(){
		Node head = this.head();		
		Node current = head;
		int length = 0;
		
		while(current != null){
			length++;
			current = current.next();			
		}
		return length;
	}
	
	public String toString(){
		Node head = this.head();		
		Node current = head;
		StringBuilder sb = new StringBuilder();
		while(current != null){
			sb.append(current.toString());
			current = current.next();			
		}
		return sb.toString();
	}
	
	public static class Node{
		private Node next;
		private String data;
		
		public Node(String data){
			this.data = data;			
		}
		
		public String data(){
			return data;
		}
		
		public void setData(String data){
			this.data = data;
		}
		
		public Node next(){
			return next;
		}
		
		public void setNext(Node next){
			this.next = next;	
		}
		public String toString(){
			return this.data;
		}
	
	}
}
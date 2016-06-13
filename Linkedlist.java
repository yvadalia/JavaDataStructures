import java.util.*;

public class Linkedlist {
	private Node head;
	// Constructor with head Node
	public Linkedlist(){
		head = new Node();
		
	}
	
	public void insertDataTail(Object data){
		if(head.data == null){
			head.data = data;
		}else if(head != null){
			Node temp = new Node(data);
			Node selected = head;
				while( selected.getNext() != null){
					selected = selected.getNext();
				}
				selected.setNext(temp);
		}
				
	}
	
	public void insertDataHead(Object data){
		Node temp = new Node(data);
		temp.next = head;
		head = temp;
	}
	
	public void removeData(Object data){
		//Node selected = head;
		/*if(data == head.data){
			head = head.next;
		}*/
		Node selected = this.head;
		while(selected != null){
			if(selected.data == data){
				selected.data = selected.next.data;
				selected.next = selected.next.next;
				break;
			}else selected = selected.next;
		}
		if(selected == null){
			System.out.println("Given element is not peresent in the Linkedlist");
		}
		
	}
	
	
	public void printHead(){
		Node selected = head;
		while(selected.getNext()!= null){
			System.out.println(selected.getData());
			selected = selected.getNext();
		}
		if(selected.getNext() == null){
			System.out.println(selected.getData());
		}
		
	}
	
	
	private class Node{
		
		private Node next;
		Object data;
		
		public Node(){
			this.data = null;
			this.next = null;			
		}
		public Node(Object data){
			this.data = data;
			this.next = null;
			
		}
		
		public Node(Object data, Node next){
			this.data = data;
			this.next = next;
			
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public Object getData() {
			return data;
		}

		public void setData(Object data) {
			this.data = data;
		}
				
	}
	
	public static void main(String[] args){
		Linkedlist l1 = new Linkedlist();
		l1.insertDataTail("qwe");
		l1.insertDataTail(9);
		l1.insertDataTail(1);
		l1.removeData(15);
		l1.printHead();
		l1.insertDataHead("head");
		l1.printHead();
		System.out.println("head" + "  "+l1.head.getData());
		//System.out.println("head" + "  "+l1.head.next.data);
		//System.out.println("head" + "  "+l1.head.next.next.data);
	}

}

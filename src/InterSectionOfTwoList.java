
public class InterSectionOfTwoList {
		
		static Node head1,head2 ;
		
		static class Node {
			
			int data;
			Node next;
			
			Node(int data){
				
				this.data = data;
				next = null;
			}
		}
		
		public static void main(String[] args) {
			
			InterSectionOfTwoList list = new InterSectionOfTwoList();
			 
	        // creating first linked list
	        list.head1 = new Node(3);
	        list.head1.next = new Node(6);
	        list.head1.next.next = new Node(10);
	        list.head1.next.next.next = new Node(15);
	        list.head1.next.next.next.next = new Node(30);
	 
	        // creating second linked list
	        list.head2 = new Node(11);
	        list.head2.next = new Node(6);
	        list.head2.next.next = new Node(10);
	        list.head2.next.next.next = new Node(15);
	        list.head2.next.next.next.next = new Node(30);
	 
	        System.out.println("The node of intersection is " + list.getNode(head1,head2));
		}

		private int getNode(Node head1,Node head2) {
			// TODO Auto-generated method stub
			
			Node current1 = head1;
			Node current2= head2;
			

			int n1=countLength(head1);
			int n2 = countLength(head2);
					
			if(n1>n2)
				return getIntersection(head1,head2, n1-n2);
			else
				return getIntersection(head2,head1,n2-n1);

	    }
	private int getIntersection(Node nead1, Node h2, int d) {
		
		
		Node current1 = head1;
		Node current2 = head2;
				
		for(int i =0; i<d;i++)
			current1 = current1.next;
		
		while(current1.next !=null || current2.next!=null){
			if(current1.data == current2.data)
				return current1.data;
			
			current1 = current1.next;
			current2 = current2.next;
		
		}
		return -1;
			
		}

	private int countLength(Node head22) {
			// TODO Auto-generated method stub
			
			int count =0;
			Node currNode = head22;
			
			while(currNode!=null){
				
				currNode=currNode.next;
				count++;
				
			}
			
			return count;
		}
		
}

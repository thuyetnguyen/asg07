class Node{
	Item data;
	Node next;
	Node(Item data){
		this.data=data;
		next=null;
	}
	public String toString(){
		return (""+data);
	}
}
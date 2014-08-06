class MyList implements Item{
	Node start;
	Node end;
	MyList(){
		start=null;
		end=null;
	}
	public void append(Item a){
		Node temp=new Node(a);
		if(start==null){
			start=temp;
			end=start;
		}else{
			end.next=temp;
			end=temp;
		}

	}	
	public MyList clone(){
		return this;
	}

	public void appendList(MyList l){
		this.end.next=l.start;
		this.end=l.end;
	}

	public int length(){
		if (start==null) return 0;
		else{
			int len=1;
			Node i=start;
			while(i!=end&&start!=null){
				len++;
				i=i.next;
			}
			return len;
		}

	}	
	public boolean equals(Item l){
		if(this.toString().equals(l.toString())) return true;
		else return false;
		/*int len=this.length();
		Node temp=this.start;
		Node temp1=l.start;
		
		if(len!=l.length()) return false;
		else{
			for(int i=0;i<len;i++){
				if(temp.data.equals(temp1.data)==false) return false;
			}
			return true;
		}*/
	} 

	public Node Itemfind(Item x){
		Node temp=new Node(x);
		Node element=this.start;
		for(int j=0;j<this.length();j++){
			if(temp.data.equals(element.data)==true){
				return element;
			}
			element=element.next;
		}
		return null;
	}

	public void invert(){
		MyList temp=new MyList();
		Node e=this.end;
		temp.append(this.end.data);
		for(int j=0;j<this.length()-1;j++){
			Node s=this.start;
			for(int i=0;i<this.length()-1;i++){
				if(s.next==e){
					temp.append(s.data);
					e=s;
					break;
				}
			s=s.next;
			}		
		}
		this.start=temp.start;
		this.end=temp.end;
	}

	public String toString(){
		Node i=start;
		String str="(";
		while(i!=end){
			str=str+i.toString()+", ";
			i=i.next;
		}
		return str+end.toString()+")";
	}
}
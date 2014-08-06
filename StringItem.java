class StringItem implements Item{
	String value;
	public StringItem(String str){
		value=str;
	}
	public StringItem clone(){
		return (new StringItem(this.value));
	}
	public String toString(){
		return value;
	}
	public boolean equals(Item l){
		return (this.toString().equals(l.toString()));
	}
}
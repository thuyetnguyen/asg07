class NumeralItem implements Item{
	int value;
	public NumeralItem(int a){
		value=a;
	}
	public NumeralItem clone(){
		return (new NumeralItem(this.value));
	}
	public String toString(){
		return (""+value);
	}
	public boolean equals(Item l){
		return (this.toString().equals(l.toString()));
	}
}
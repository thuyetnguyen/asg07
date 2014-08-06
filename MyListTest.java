class MyListTest{
	public static void main(String[] args){
		MyList l = new MyList();
		l.append(new NumeralItem(1));
		l.append(new NumeralItem(2));
	//test length():
		System.out.println(l+" length: "+l.length()); // (1, 2)
		MyList l2 = new MyList();
		l2.append(new StringItem("a"));
		l2.append(new StringItem("b"));
		System.out.println(l2+" length: "+l2.length()); // (a, b)
		l.append(l2);
		System.out.println(l+" length: "+l.length()); // (1, 2, (a, b))
		l.appendList(l2);
		System.out.println(l+" length: "+l.length()); // (1, 2, (a, b), a, b)
		System.out.println(l2+" length: "+l2.length()); // (a, b, 5)
		System.out.println(l+" length: "+l.length()); // (1, 2, (a, b), a, b)
	//test equals:
		System.out.println("l equal l?"+l.equals(l));
		System.out.println("l equal l2?"+l.equals(l2));
	//test Itemfind:
		Item a=new StringItem("a");
		System.out.println("l.itemfind(a) is: "+l.Itemfind(a));
		Item n=new StringItem("n");
		System.out.println("l.itemfind(n) is: "+l.Itemfind(n));
	//test invert:
		System.out.println("l: "+l);
		l.invert();
		System.out.println(" l.invert: "+l);

	}
}
package test;

public class A {
	public enum MyEnum{
		One(1), Two(2), Three(3);
		public int inner;
		 MyEnum(int i){
			inner = i;
		}
	}
static{
	System.out.println("Static A");
}
	public A() {
		//System.out.println("A empty");
	}
	public A(boolean a){
		this();
		//System.out.println("A boolean " + a);
	}
}

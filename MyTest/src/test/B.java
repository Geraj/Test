package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class B extends A{
	public void func(){
		A a = new A();
		func();
		a.equals(a);
	}
	public B(){
		super(false);
	}
	class C implements BB{
		int a;
		int b;
		C(int a, int b){
			this.a = a ;
			this.b = b ;
		}
		@Override
		public int addNumbers(int a, int b) {
			
			return this.a + this.b;
		}
		
	}

	public static void main(String[] arg) {
		A.MyEnum.One.inner = 2;
		System.out.println(A.MyEnum.One.inner);
		B b = new B();
		int[] array = {1,2,3};
		List<C> list= new ArrayList<>();
		list.add(b.new C(array[1], array[2]));
		array[1]=0;
		String text = "TEST \uD801\uDC00 + \u00EB";
		System.out.println(text);
		System.out.println(list.get(0).addNumbers(0, 0));		
		
		LinkedList<B> list2 = new LinkedList<>();		
		try (MyClosable closable=new MyClosable()) {
			//b.func();
			while (true) {
				b = new B();
				list2.add(b);
			}
		} 
		catch (Throwable e) {
			System.out.println(e);
		}finally 
		{ System.out.println("gg");}
		System.out.println("Survived");
	}
}

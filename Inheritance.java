package inheritance;
class A{
	int i;
}
class B extends A{
	int j;
	void add() {
		System.out.println(i+j);
	}
}
public class Inheritance {
	public static void main(String args[]) {
		B ob=new B();
		ob.i=4;
		ob.j=5;
		ob.add();
		
	}

}

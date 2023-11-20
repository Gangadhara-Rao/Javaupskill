package absrtraction;

abstract class A {
public abstract void show();
void display() {
	System.out.println("display");
}
}
class B extends A{
	public void show() {
		System.out.println("show");
	}
}
class Abstract{
public static void main(String args[]) {
	B b=new B();
	b.display();
	b.show();
}
}

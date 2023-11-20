package inheritance;

class Program extends Employee{
	String name = "chandu";
public static void main(String[] args) {
	Program p=new Program();
	System.out.println("employee salaray="+p.salary);
	System.out.println("employee name="+p.name);
	
}
}

public class Methods {
	
	public static void submain() {
		System.out.println("method1 has been called!");
	}
	
	public static void altsubmain(int x) {
		System.out.println("altmethod1 has been called! x value has " + x);
	}
	
	public void submainonstatic() {
		System.out.println("non static method has been called!");
	}
	
	public static void main(String[] args) {
		
		Methods m = new Methods();
		
		submain();
		altsubmain(5);
		m.submainonstatic();
	}
}
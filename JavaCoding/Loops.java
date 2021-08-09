public class Loops {
	
	public static void main(String[] args) {
		
		boolean isPrinted = true;
		while (isPrinted = true) {
			
			System.out.println("JAVA IS BEST");
			break;
		}
		
		int x = 5;
		for (int newx = 0; newx<10; newx++) {
			System.out.println(x);
		}
		
		int altx[] = {50,40,60,30,90};
		for (int declarednumbers : altx) {
			System.out.print(altx);
			System.out.print(" ,");
		}
	}
}
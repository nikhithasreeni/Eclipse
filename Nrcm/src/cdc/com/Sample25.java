package cdc.com;
class Sample26{
	static void show() {
		System.out.println("hi");
	}
	static class Test25{
		static void print() {
			System.out.println("hello");
			show();
		}
	}	
}
public class Sample25 {
	public static void main(String[] args) {
		Sample26.Test25.print();
	}

}

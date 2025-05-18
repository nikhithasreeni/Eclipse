package cdc.com;

public class Sample23 {
	void show() {
		System.out.println("hi");
	}
	class Test23{
		void print() {
			System.out.println("hello");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample23 s1=new Sample23();
		s1.show();
		Sample23.Test23 t1=new Sample23().new Test23();
		t1.print();
	}

}

package cdc.com;
class Demo1{
	void show() {
		System.out.println("hi");
	}
}
public class Sample27 {
	Demo1 d=new Demo1() {
		void show() {
			System.out.println("hello");
			super.show();
		}
	};
	public static void main(String[] args) {
		Sample27 s1=new Sample27();
		s1.d.show();
	}

}

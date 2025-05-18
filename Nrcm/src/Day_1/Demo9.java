package Day_1;

abstract class Test3{
	abstract void add();
	abstract void sub();

	static void mul() {
		System.out.println("play cricket");
	}
	 void div() {
		System.out.println("dancing");
	}
	 void mod() {
			System.out.println("dancing");
		}

	 
}
class Sample1 extends Test3{
	public void add() {
		System.out.println("hi");
	}
	public void sub() {
		System.out.println("hello");
	}
}
class Demo9{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample1 d1=new Sample1();
		d1.add();
		d1.sub();
		d1.div();
		d1.mod();
		Test3.mul();
	}



}

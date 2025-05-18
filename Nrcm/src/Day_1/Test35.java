package Day_1;
interface I1{
	void add();
}
class Test56{
	void sub() {
		System.out.println("hello");
	}
}

public class Test35 extends Test56 implements I1{
	public void add() {
		System.out.println("hi");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test35 t1=new Test35();
		t1.add();
		t1.sub();
	}

}

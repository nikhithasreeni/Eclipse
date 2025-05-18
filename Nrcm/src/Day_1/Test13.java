package Day_1;

public class Test13 {
	int a;
	int b;
	public Test13(int x,int y) {
		a=x;
		b=y;
		System.out.println(x+y);
	}
	public void add() {
		System.out.println(this.a-this.b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test13 t1=new Test13(78,34);
		t1.add();
		
	}

}

package Day_1;

public class Test14 {
	int x;
	int y;
	public Test14(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println(x+y);
	}
	public Test14(Test14 t1) {
		this.x=t1.x;
		this.y=t1.y;
		System.out.println(x-y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test14 t1=new Test14(45,23);
		Test14 t2=new Test14(t1);
	}

}

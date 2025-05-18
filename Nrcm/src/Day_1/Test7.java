package Day_1;

public class Test7 {
	int a=89;
	public void add() {
		System.out.println("add");
	}
	public void sub() {
		this.add();
		System.out.println(this.a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test7 t1=new Test7();
		t1.sub();
				
	}

}

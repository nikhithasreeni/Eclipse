package Day_1;

public class Test15 {
	int x;
	int y;
	int z;
	public Test15() {
		System.out.println("hi");
	}
	public Test15(int x) {
		this.x=x;
		System.out.println(x);
	}
	public Test15(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println(x+y);
	}
	public Test15(int x,int y,int z) {
		this.x=x;
		this.y=y;
		this.z=z;
		System.out.println(x+y+z);
	}

	public static void main(String[] args) {
		Test15 t1=new Test15();
		Test15 t2=new Test15(23);
		Test15 t3=new Test15(23,45);
		Test15 t4=new Test15(23,45,67);



	}

}

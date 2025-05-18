package Day_1;

public class Demo21 {
	public static void main(){
		System.out.println("hii");
	}
	public static void main(int a) {
		System.out.println(a);
	}
	public static void main(int a,int b) {
		System.out.println(a+b);
	}
	public static void main(int a,int b,double d1) {
		System.out.println(a+b-d1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Demo21 d1=new Demo21();
		main();
		main(34);
		main(2, 7);
		main(4, 6, 8.8);
	}

}

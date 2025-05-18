package cdc.com;

public class Sample28 {

	public static void main(String[] args) {
		int a=20;

		try {
			int b=Integer.parseInt(args[0]);

		int c=a/b;
		System.out.println(c);

		}catch(Exception e) {
		e.printStackTrace();
		}
		}
}

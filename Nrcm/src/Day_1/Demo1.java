package Day_1;

public class Demo1 {

	public static void main(String[] args) {
		int a=10;
		if(a%2==0) {
			System.out.println("multiplied by 2");
			if(a%3==0) {
				System.out.println("it multiplied with 3");
			}
			else {
				System.out.println("not multiplied with 3");
			}
		}
		else {
			if(a<=10) {
				System.out.println("below ten");
			}else {
				System.out.println("above ten");
			}
		}
		
	}

}

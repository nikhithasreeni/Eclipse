package Day_1;
class Sample45{
	public Sample45() {
		System.out.println("good evening");
	}
	int x=99;
	void print() {
		System.out.println("hello");
	}
}

public class Test45 extends Sample45{
	public Test45(){
		super();
	}
    void show() {
    	int y=45;
    	super.print();
    	System.out.println(super.x);
    	System.out.println(y);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test45 t1=new Test45();
		t1.show();
	}

}

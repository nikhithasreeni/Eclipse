package Day_1;

public class Demo6 {
	public static void main(String[] args) {
	String str = "helloworld";
	String vowels =""; 
	String consonants ="";
	for (int i = 0; i < str.length(); i++) {
	    char ch = str.charAt(i);
	    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
	    	vowels+=ch;
	    else if (ch >= 'a' && ch <= 'z') 
	    	consonants+=ch;
	}
	System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
	}
}



package pre;
import java.util.Scanner;
//string is a Palindrome or not.
public class Palindrome {
///A string is a palindrome when it stays the same on reversing the order of characters in that string.
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.nextLine();
		
		//String str ="madam";
		String reverse ="";
		int length = str.length();
		for(int i=0; i<length;i++) {
	        reverse=str.charAt(i)+reverse;	
		}
		//It can be achieved by reversing the original string first 
		//and then checking if the reversed string is equal to the original string.		
		if(str.equals(reverse)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}
}



package pre;
//Reverse a String
public class ReveStr {

	public static void main(String[] args) {
		//declare a string
		String str ="hello";
		String reverse ="";
		//take out the length of the String
		int length = str.length();
		//loop through the characters of the string
		for(int i=0; i<length;i++) {
			//add the characters in reverse order in the new string
			reverse=str.charAt(i)+reverse;
			
		}
		System.out.println(reverse);

	}

}

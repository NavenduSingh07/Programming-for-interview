package array;

public class CharacterOccurrence {

	    public static void main(String[] args) {
	        String inputString ="Hello world!";
	        char targetChar='o';
	        
	        int count =0;
	        for(int i=0; i<inputString.length();i++){
	            if(inputString.charAt(i)==targetChar){
	                count++;
	            }
	        }
	        System.out.println("The character "+targetChar+"occurs "+count+" times in the String.");
	    }
	}



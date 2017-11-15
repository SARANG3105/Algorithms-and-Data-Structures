//recursive solution for checking a word is a palindrome or not
public class Palindrome {
	boolean isPalindrome(String s) {
		if(s.length()<=1) return true;
	    return s.charAt(0)==s.charAt(s.length()-1) &&
			       isPalindrome(s.substring(1, s.length()-1));
	}
	public static void main(String args[]) {
		Palindrome pal= new Palindrome();
		System.out.println(pal.isPalindrome("wasitacaroracatisaw"));
		
	}

}

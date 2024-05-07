package day8;

public class StringRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "MalayalaM";
		String rev = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			rev = rev + a.charAt(i);
		}
		if (rev.equals(a)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Pallindrome");
		}

	}

}

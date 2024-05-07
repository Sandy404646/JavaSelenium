package day6;

public class Stringrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Malayalam";
		String d = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			d = d + a.charAt(i);
		}
		System.out.println(d);
		if (a.equalsIgnoreCase(d)) {
			System.out.println("Pallindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}

}

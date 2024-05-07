package day4;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "malayalam1";
		String b = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			b = b + a.charAt(i);
		}
		System.out.println(b);
		if (b.equalsIgnoreCase(a)) {
			System.out.println("PALLINDROME");
		} else {
			System.out.println("NOT PALLINDROME");
		}

	}

}

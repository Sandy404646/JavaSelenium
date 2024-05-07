package day3;

public class pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ori = "MALAYALAM";
		String rev = "";

		for (int i = ori.length() - 1; i >= 0; i--) {
			rev = rev + ori.charAt(i);
		}
		System.out.println(rev);
		if (ori.equalsIgnoreCase(rev)) {
			System.out.println("Pallindrome");
		} else {
			System.out.println("Not Pallindrome");
		}

	}
}
package santhosh.Java;

public class DuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "sspplluuiioo";
		int duplicate = 0;

		for (int i = 0; i <= a.length() - 1; i++) {
			for (int j = i + 1; j <= a.length() - 1; j++) {
				if (a.charAt(i) == a.charAt(j)) {
					System.out.println("Duplicate is: " + a.charAt(j));
					duplicate++;
				}
			}
		}
		System.out.println("no of Dupliactes: " + duplicate);

	}

}

package day9;

public class StringRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "Santosh kumar";
		String rev = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			rev = rev + a.charAt(i);
		}
		System.out.println(rev);

	}

}
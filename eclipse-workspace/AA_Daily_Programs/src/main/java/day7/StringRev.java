package day7;

public class StringRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ori = "MalayalaMn";
		String rev = "";
		for (int i = ori.length() - 1; i >= 0; i--) {
			rev = rev + ori.charAt(i);
		}
		System.out.println(rev);
		if (rev.equalsIgnoreCase(ori)) {
			System.out.println("Pallindrome");
		} else {
			System.out.println("Not Pallindrome");
		}

	}

}

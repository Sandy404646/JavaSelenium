package day8;

public class SwappingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Santhosh";
		String b = "Kumar";
		String c = "";
		System.out.println(a);
		System.out.println(b);
		a = a + b;
		b = a.substring(0, a.length() - b.length()); // store a vale in b
		a = a.substring(b.length()); // store b value in a

		System.out.println(a);
		System.out.println(b);

	}

}

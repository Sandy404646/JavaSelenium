package day7;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.println(a);
		System.out.println(b);
		for (int i = 1; i <= 8; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.println(c);
		}
	}
}

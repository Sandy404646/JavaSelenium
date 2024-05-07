package day1;

public class Fibbonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.println(a);
		System.out.println(b);
		for (int i = 0; i <= 9; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.println(c);
		}

	}

}

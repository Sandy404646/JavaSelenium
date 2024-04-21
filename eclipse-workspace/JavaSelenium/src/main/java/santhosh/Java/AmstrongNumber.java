package santhosh.Java;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 371;
		int b, c = 0;
		int d = 0;
		d = a;
		while (d > 0) {
			b = d % 10;
			c = (b * b * b) + c;
			d = d / 10;
		}
		System.out.println(c);

	}

}

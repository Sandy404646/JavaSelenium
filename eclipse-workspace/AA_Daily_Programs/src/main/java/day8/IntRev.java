package day8;

public class IntRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 45789;
		System.out.println(a);

		int b, c = 0;
		int d = 0;
		d = a;
		while (d > 0) {
			b = d % 10;
			c = (c * 10) + b;
			d = d / 10;
		}
		System.out.println(c);

	}

}

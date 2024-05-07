package day6;

public class ReverseInt {

	public static void main(String[] args) {
		int a = 1546987;
		System.out.println(a);
		int b = 0;
		int c = 0;
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

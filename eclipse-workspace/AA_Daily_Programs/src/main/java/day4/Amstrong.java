package day4;

public class Amstrong {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 153;
		int b = 0;
		int c = 0;
		int d = 0;
		d = a;
		while (d > 0) {
			b = d % 10; // last number
			c = (b * b * b) + c; // cube the derived number and store in c
			d = d / 10; // remove last value of d
		}
		if (c == a) {
			System.out.println("Amstrong number");
		} else {
			System.out.println("Not an Amstrong number");
		}

	}

}

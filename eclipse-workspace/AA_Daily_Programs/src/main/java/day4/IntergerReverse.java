package day4;

import java.util.Scanner;

public class IntergerReverse {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
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

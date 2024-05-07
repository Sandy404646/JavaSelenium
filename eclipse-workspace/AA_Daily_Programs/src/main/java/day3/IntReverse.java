package day3;

import java.util.Scanner;

public class IntReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=0;
		int c=0;
		int d=0;
		d=a;
		while(d>0) {
			b=d%10;
			c=b+(c*10);
			d=d/10;
		}
		System.out.println(a);
		System.out.println(c);
	}

}

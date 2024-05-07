package day10;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		int c=0;
		c=a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);
		

	}

}

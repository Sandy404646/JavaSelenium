package day4;

public class Fibbonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.println(a);
		System.out.println(b);
		for (int i = 2; i <= 10; i++) {
			c = a + b; //adding 1st 2 numbers
			a = b;  //assign a to b
			b = c;  //assign b to c
			System.out.println(c);
		}

	}

}

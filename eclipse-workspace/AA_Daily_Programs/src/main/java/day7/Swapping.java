package day7;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		withDummy();
		withoutDummy();

	}

	public static void withDummy() {
		int a = 45;
		int b = 18;
		int c = 0;
		System.out.println("=========With Swapping=========");
		System.out.println("=========Before Swapping=========");
		System.out.println(a);
		System.out.println(b);
		System.out.println("===============================");
		c = a;
		a = b;
		b = c;
		System.out.println("=========After Swapping=========");
		System.out.println(a);
		System.out.println(b);
		System.out.println("===============================");
	}

	public static void withoutDummy() {
		int c = 579;
		int d = 967;
		System.out.println("=========Without Swapping=========");
		System.out.println("=========Before Swapping=========");
		System.out.println(c);
		System.out.println(d);
		System.out.println("===============================");
		c = c + d;
		d = c - d;
		c = c - d;
		System.out.println("=========After Swapping=========");
		System.out.println(c);
		System.out.println(d);
		System.out.println("===============================");
	}

}

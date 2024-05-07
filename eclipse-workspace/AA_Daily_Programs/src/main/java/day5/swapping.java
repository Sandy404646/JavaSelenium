package day5;

public class swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 45;
		int b = 87;
		System.out.println("Before swapping");
		System.out.println(a);
		System.out.println(b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swapping");
		System.out.println(a);
		System.out.println(b);

		int i = 85;
		int j = 21;
		int k = 0;
		System.out.println(i);
		System.out.println(j);
		k = i;
		i = j;
		j = k;
		System.out.println(i);
		System.out.println(j);

	}

}

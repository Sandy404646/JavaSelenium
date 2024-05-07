package day3;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 54;
		int c = 0;
		System.out.println("BEFORE SWAPPING");
		System.out.println(a);
		System.out.println(b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("AFTER SWAPPING");
		System.out.println(a);
		System.out.println(b);
		//--------with dummy---------
		int i = 10;
		int j = 54;
		int k = 0;
		System.out.println("BEFORE SWAPPING");
		System.out.println(i);
		System.out.println(j);
		k=i;
		i=j;
		j=k;
		System.out.println("AFTER SWAPPING");
		System.out.println(i);
		System.out.println(j);

	}

}

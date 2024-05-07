package day1;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=54;
		int b=84;
		int c=0;
		System.out.println("-------With Dummy--------");
		System.out.println("Before Swapping");
		System.out.println(a);
		System.out.println(b);
		c=a; //c=54
		a=b; //a=84
		b=c;
		System.out.println("After Swapping");
		System.out.println(a);
		System.out.println(b);
		System.out.println("-------Without Dummy--------");
		int i=97;
		int j=14;
		System.out.println("Before Swapping");
		System.out.println(i);
		System.out.println(j);
		i=i+j; //i=111
		j=i-j; //j=111-14=97
		i=i-j; //i=111-97=14
		System.out.println("After Swapping");
		System.out.println(i);
		System.out.println(j);
	
	}
}

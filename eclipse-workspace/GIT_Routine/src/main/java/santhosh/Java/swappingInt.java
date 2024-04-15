package santhosh.Java;

public class swappingInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=78;
		int b=49;
		System.out.println("======Before Swapping======");
		System.out.println(a);
		System.out.println(b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("======After Swapping======");
		System.out.println(a);
		System.out.println(b);
	}

}

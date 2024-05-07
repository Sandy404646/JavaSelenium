package day10;

public class StringSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="Santhosh";
		String b="R";

		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println(a);
		System.out.println(b);
	}

}

package day2;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=45;
		int b=97;
		int c=0;
		System.out.println("----Before Swapping");
		System.out.println(a);
		System.out.println(b);
		c=a;//c=45
		a=b;//a=97
		b=c;//b=45
		System.out.println("----After Swapping");
		System.out.println(a);
		System.out.println(b);
		int d=12;
		int e=59;
		System.out.println("----Before Swapping");
		System.out.println(d);
		System.out.println(e);
		d=d+e;
		e=d-e;
		d=d-e;
		System.out.println("----After Swapping");
		System.out.println(d);
		System.out.println(e);
		
	}

}

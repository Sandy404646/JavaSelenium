package day1;

public class amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=153;
		int b=0;
		int c=0;
		int d=0;
		d=a;
		while(d>0) {
			b=d%10;
			c=c+(b*b*b);
			d=d/10;
		}
		System.out.println(c);
		if(c==a) {
			System.out.println("Amstrong");
		}else {
			System.out.println("Not Amstrong");
		}

	}

}

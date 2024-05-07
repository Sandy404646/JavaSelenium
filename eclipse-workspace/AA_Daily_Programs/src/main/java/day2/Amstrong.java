package day2;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3701;
		int b=0;
		int c=0;
		int d=0;
		d=a;
		while(d>0) {
			b=d%10;
			c=c+(b*b*b);
			d=d/10;
		}
		if(c==a) {
			System.out.println("Amstrong");
		}else {
			System.out.println("Not Amstrong");
		}
		

	}

}

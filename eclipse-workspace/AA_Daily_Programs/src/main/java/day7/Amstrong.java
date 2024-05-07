package day7;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=371;
		int b,c=0;
		int d=0;
		d=a;
		while(d>0) {
			b=d%10;
			c=c+(b*b*b);
			d=d/10;
			
		}
		System.out.println(c);
		
		
		

	}

}

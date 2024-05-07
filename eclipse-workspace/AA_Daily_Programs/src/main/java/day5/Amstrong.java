package day5;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int a=s.nextInt();
		int b=0;
		int c=0;
		int d=0;
		d=a;
		while(d>0) {
			b=d%10;
			c=c+(b*b*b);
			d=d/10;
			
		}if(c==a) {
			System.out.println("Amstrong");
		}else {
			System.out.println("Not Amstrong");
		}
		
		

	}

}

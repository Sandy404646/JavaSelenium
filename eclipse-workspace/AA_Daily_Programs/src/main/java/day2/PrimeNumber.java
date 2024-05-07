package day2;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=712;
		int b=0;
		for(int i=2;i<=a/2;i++) {
			if(a%i==0) {
				b++;
			}
		}if(b==0) {
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");
		}
		
		
		

	}

}

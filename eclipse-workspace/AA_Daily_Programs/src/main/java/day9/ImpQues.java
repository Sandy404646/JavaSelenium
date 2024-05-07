package day9;

public class ImpQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "!$#@$%#^%$^&%*santhosh123456";

		int caps = 0;
		int small = 0;
		int spl = 0;
		int vow = 0;
		int non_vow = 0;

		for (int i = 0; i <= a.length() - 1; i++) {
			char b = a.charAt(i);

			if (b >= 'a' && b <= 'z') {
				small++;
			} else if (b >= 'A' && b <= 'Z') {
				caps++;
			} else {
				spl++;
			}

		}
		
		for(int i=0;i<=a.length()-1;i++) {
			char b = a.charAt(i);
			if(b=='A'|b=='E'|b=='I'|b=='O'|b=='U'|b=='a'|b=='e'|b=='i'|b=='o'|b=='u') {
				vow++;
			}else {
				non_vow++;
			}	
		}
		System.out.println("Caps: " + caps);
		System.out.println("Small: " + small);
		System.out.println("Spl: " + spl);
		System.out.println("Vowels: "+vow);
		System.out.println("Non-Vowels: "+non_vow);
		
	}

}

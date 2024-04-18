package santhosh.Java;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Santhosh Kumar 89,46,93,7";
		int Caps = 0;
		int small = 0;
		int num = 0;
		int spl = 0;
		int vowel = 0;
		int nonvowel = 0;
		for (int i = 0; i <= a.length() - 1; i++) {
			char b = a.charAt(i);
			if (b >= 'a' && b <= 'z') {
				small++;
			} else if (b >= 'A' && b <= 'B') {
				Caps++;
			} else if (b >= '0' && b <= '9') {
				num++;
			} else {
				spl++;
			}
		}
		for (int i = 0; i <= a.length() - 1; i++) {
			char b = a.charAt(i);
			if (b == 'A' | b == 'E' | b == 'I' | b == 'O' | b == 'U') {
				vowel++;
			} else if (b == 'a' | b == 'e' | b == 'i' | b == 'o' | b == 'u') {
				vowel++;
			} else {
				nonvowel++;

			}
		}
		System.out.println("Caps : " + Caps);
		System.out.println("Small :" + small);
		System.out.println("Number :" + num);
		System.out.println("Special :" + spl);
		System.out.println("Vowels :" + vowel);
		System.out.println("Non Vowels :" + nonvowel);
	}

}

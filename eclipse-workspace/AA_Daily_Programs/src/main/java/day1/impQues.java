package day1;

public class impQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Java Is a Simple Programming $ Language 457965466 @##$%#&*!";
		String k = a.replace(" ", "");
		int caps = 0;
		int small = 0;
		int num = 0;
		int spl = 0;
		int vowel = 0;
		int nonvowel = 0;

		for (int i = 0; i <= k.length() - 1; i++) {
			char b = k.charAt(i);
			if (b >= 'a' && b <= 'z') {
				small++;
			} else if (b >= 'A' && b <= 'Z') {
				caps++;
			} else if (b >= '0' && b <= '9') {
				num++;
			} else {
				spl++;
			}
			if (b == 'a' || b == 'e' || b == 'i' || b == 'o' || b == 'u' || b == 'A' || b == 'E' || b == 'I' || b == 'O'
					|| b == 'U') {
				vowel++;
			} else {
				nonvowel++;
			}
		}

		System.out.println("Capital= " + caps);
		System.out.println("Small= " + small);
		System.out.println("Number= " + num);
		System.out.println("spl= " + spl);
		System.out.println("Vowel= " + vowel);
		System.out.println("Non Vowel= " + nonvowel);

	}

}

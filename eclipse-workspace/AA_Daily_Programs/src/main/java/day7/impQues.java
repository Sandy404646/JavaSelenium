package day7;

public class impQues {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "The Pandavas had full $upp0r+ of Kri$hna 786-786";
		int smallletters = 0;
		int capitalletters = 0;
		int numbers = 0;
		int specialChar = 0;
		int spaces = 0;
		int vowels = 0;
		int nonvowels = 0;
		for (int i = 0; i <= a.length() - 1; i++) {
			char q = a.charAt(i);
			if (q >= 'A' && q <= 'Z') {
				capitalletters++;
			} else if (q >= 'a' && q <= 'z') {
				smallletters++;
			} else if (q >= '0' && q <= '9') {
				numbers++;
			} else if (q == ' ') {
				spaces++;
			} else {
				specialChar++;
			}
		}
		for (int i = 0; i <= a.length() - 1; i++) {
			char w = a.charAt(i);
			if (w == 'a' || w == 'e' || w == 'i' || w == 'o' || w == 'u') {
				vowels++;
			} else {
				nonvowels++;
			}
		}
		System.out.println("VOWELS: " + vowels);
		System.out.println("NON-VOWELS: " + nonvowels);
		System.out.println("CAPITAL: " + capitalletters);
		System.out.println("SMALL: " + smallletters);
		System.out.println("NUMBERS: " + numbers);
		System.out.println("SPACES: " + spaces);
		System.out.println("SPECIALCHAR: " + specialChar);
	}
}
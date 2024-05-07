package day2;

public class ImportantQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "I have Good Knowledge on Java & $elen!um 100%";
		int small = 0;
		int caps = 0;
		for (int i = 0; i <= a.length() - 1; i++) {
			char b = a.charAt(i);
			if (b >= 'a' && b <= 'z') {
				small++;
			} else if (b >= 'A' && b <= 'Z') {
				caps++;
			}
		}
		System.out.println("Small= " + small);
		System.out.println("Caps= " + caps);
	}

}

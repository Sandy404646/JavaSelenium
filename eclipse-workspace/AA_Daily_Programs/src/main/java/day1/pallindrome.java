package day1;

public class pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="MalayalaM";
		String b="";
		for(int i=a.length()-1;i>=0;i--){
			b=b+a.charAt(i);
		}
		if(b.equalsIgnoreCase(a)) {
			System.out.println("Pallindrome");
		}else {
			System.out.println("Not Pallindrome");
		}
	}
}

package day5;

public class StringRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Santhosh";
		String rev="";
		for(int i=a.length()-1;i>=0;i--) {
			rev=rev+a.charAt(i);
		}
		System.out.println(rev);
	}

}

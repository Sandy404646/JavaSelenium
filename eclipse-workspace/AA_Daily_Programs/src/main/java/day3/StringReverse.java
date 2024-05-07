package day3;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ori="balram kamal";
		String rev="";
		for(int i=ori.length()-1;i>=0;i--) {
			rev=rev+ori.charAt(i);
		}
		System.out.println(rev);

	}

}

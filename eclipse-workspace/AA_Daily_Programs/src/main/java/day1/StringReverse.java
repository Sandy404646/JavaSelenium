package day1;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ori="JavA";
		String dup="";
		for(int i=ori.length()-1;i>=0;i--) {
			dup=dup+ori.charAt(i);
		}
		System.out.println("-----Original------");
		System.out.println(ori);
		System.out.println("-----Reversed------");
		System.out.println(dup);
	}

}

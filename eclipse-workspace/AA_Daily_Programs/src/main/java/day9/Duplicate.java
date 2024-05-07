package day9;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="santhohs kuamr";
		
		
		for(int i=0;i<=a.length()-1;i++) {
			
			for(int j=i+1;j<=a.length()-1;j++) {
				if(a.charAt(i)==a.charAt(j)) {
					System.out.println("Duplicates are: "+a.charAt(j));
				}
				
				
			}
		}
		
		
		
		

	}

}

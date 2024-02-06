package Utilities;

public class Test {
	
	public static void main(String args[]) {
		
		String str = "Hello World";
		StringBuilder stb = new StringBuilder();
		
		for(int i=str.length()-1; i>=0;i--) {
			
			stb.append(str.charAt(i));
			
		}
		
		System.out.println(stb);
		
	}

}

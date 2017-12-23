package basicsLearning;

public class strings {
	
	public static String   str1 = "Configure-GIT-with-Jenkins";
	public static String   str2 = "JAVA String Methods"; 
	
	public static void main(String[] args) {
		String[] str1Split = str1.split("[-]");
		String[] str2Split = str2.split("\\s");
		for(int i=0;i<str1Split.length;i++) {
			String a1 = str1Split[i];
			System.out.println("Length of "  +a1 +    " is "    + a1.length());
		//	System.out.println(str1Split[i]);
		}
		for(int i=0;i<str2Split.length;i++) {
			String a1 = str2Split[i];
			System.out.println("Length of "  +a1 +    " is "    + a1.length());
		//	System.out.println(str2Split[i]);
		}
		
	}

}

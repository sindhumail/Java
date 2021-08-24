package practice;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String input = "sindhu"; char[] chars=input.toCharArray(); for(int i
		 * =chars.length-1;i>=0;i--) { System.out.print(chars[i]); }
		 */
		
		//palindrome =
		String name ="madam";
		
		  String t =""; 
		  for(int i =name.length()-1;i>=0;i--) 
		  {
			  t=t+name.charAt(i); 
		  }
		  System.out.println(t); 
		  if(name.equalsIgnoreCase(t)) {
			  
		  System.out.println("It is palindrome");
		  }
		 
		/*
		 * ///String Builder StringBuilder strBuilder = new StringBuilder(name);
		 * StringBuilder reverse =strBuilder.reverse(); System.out.println(reverse);
		 * 
		 */

	}

}

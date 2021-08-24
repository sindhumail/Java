package practice;

public class Swap {

	public static void main(String[] args) {
		String input = "sindhu";
        int len = input.length();
        String rev="";
        for(int i =len-1;i>=0;i--)
        {
             rev= rev+input.charAt(i);
        }	
		System.out.println(rev);
	}
		//  for loop with charAt method


}

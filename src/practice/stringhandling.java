package practice;

public class stringhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//To check $100 is present in the paid or not
		String string ="Payment $100 paid";//This simple syntax is valid for only String class instead of using new keyword memory allocation operator
		
		//String str = new String("Payment $100 paid");//instead of this we can write as above
		System.out.println(string.charAt(8));
		//single purchase dollar is 8th
		//plural putchase dollar will be 9 one more s char is added
		//check for mulitple payments
		String str2="Payments $100 paid";
				System.out.println(str2.indexOf("$"));
				System.out.println(str2.substring(9));
		
				
				
				
				
		
	}

}

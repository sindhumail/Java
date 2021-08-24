package practice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Highestnumberarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[]= {100,200,300,900,500};
		
		  int max =num[0];
		  for(int i=1;i<num.length;i++) 
		  { 
			  if(num[i]>max)
			  {
				  max=num[i];
				  
		  } 
			  } System.out.println("Highest is "+max);
		 
		
		
		/*
		 * //Using Array Stream Method int i = Arrays.stream(num).max().getAsInt();
		 * System.out.println(i);
		 */

	}

}

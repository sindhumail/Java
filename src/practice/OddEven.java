package practice;

import java.util.Collections;

public class OddEven {

	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5,6,100,99,587};
		System.out.println("Even numbers");
		for (int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
			/*
			 * else if(a[i]%2!=0) { System.out.println("Odd number" +a[i]); }
			 */
		}
		System.out.println("Odd numbers");
		for(int i=0;i<a.length;i++){
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
		}
		
		

	}

}

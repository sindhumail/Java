package practice;

public class duplicateeleofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {22,55,44,66,22,44};
		
		for(int i =0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
				}
				
			}
			
		}

	}

}

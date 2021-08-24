package practice;

public class arrayascendingorder {

	public static void main(String[] args) {
		
		int arr[]= {20,970,80,50,876,999,100};
		
		for(int i =0;i<arr.length;i++)
		{
			System.out.println("GIVEN ORDER"+arr[i]);
		}
		// TODO Auto-generated method stub

		int temp=0;
		for(int i =0;i<arr.length;i++)
			
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		for(int i =0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}

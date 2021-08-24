package practice;

public class Primenumber {
	
	public void checkprime(int n)
	{
		
		boolean flag=false;
		for(int i =2;i<=n/2;i++)
			{
			if(n%i==0)
			{
				flag= true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println(n+"it is prime");
		}
		else
		{
			System.out.println(n+"Not a Prime");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Primenumber Primenumber = new Primenumber();
		Primenumber.checkprime(7);

	}

}

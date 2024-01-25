package Loops.Pattern;
/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
************
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
****************
1 
2 2
3 3 3 
4 4 4 4
5 5 5 5 5
****************
5 4 3 2 1
5 4 3 2
5 4 3
5 4
5
*/
public class NumberExecution {
	
	public void pattern1(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
		System.out.println(" ");
		}
	}
	public void pattern2(int n)
	{
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
		System.out.println(" ");
		}
	}
	public void pattern3(int n) 
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
		System.out.println(" ");
		}
	}
	public void pattern4(int n) 
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(j+" ");
			}
		System.out.println(" ");
		}
	}

}

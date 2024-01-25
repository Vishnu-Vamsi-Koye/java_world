package Loops.Pattern;

public class StarPattern {
	public void square(int n){
		for(int i=n;i>=1;i--)
		{
			for(int j=n;j>=1;j--)
			{
			System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
	public void pattern1(int n){
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print("* ");
			}
			System.out.println(" ");
		}
		
	}
	public void pattern2(int n){
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
			System.out.print("* ");
			}
			System.out.println(" ");
		}
		
	}	

	public void righttriangle(int n) {
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<n;j++)
			{
			System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
			System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
	public void lefttriangle(int n) {
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print("* ");
			}
			for(int j=i;j<n;j++)
			{
			System.out.print("  ");
			}
			
			System.out.println(" ");
		}
	}
	public void pyramid(int n) {
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<n;j++)
			{
			System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
			System.out.print("* ");
			}
			for(int j=1;j<i;j++)
			{
			System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
	public void reversepyramid(int n) {
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print("  ");
			}
			for(int j=i;j<n;j++)
			{
				System.out.print("* ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print("* ");
			}
			
		System.out.println(" ");
		}
	}
	public void rhombus(int n) {
		for(int i=1; i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<i;j++)
			{
				System.out.print("* ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
		System.out.println(" ");
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print("  ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print("* ");
			}
			for(int j=i;j<n;j++)
			{
				System.out.print("* ");
			}
			
		System.out.println(" ");
		}
	}

}

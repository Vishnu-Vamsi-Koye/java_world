package Loops.Pattern;
import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("");
		int m=scanner.nextInt();
		System.out.println("");
		int n=scanner.nextInt();
		for(int i=1;i<=m;i++)
		{
			for (int j=1;j<=n;j++)
			{
				System.out.print(m*n);
			}
			System.out.println("");
		}
		scanner.close();

		System.out.println("New Pattern ");
		System.out.println("printing 8 only ");

		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=10;j++)
			{
			System.out.print("8");
			}
			System.out.println(" ");
		}

	}

}

package Patterns;
import java.util.Scanner;
public class AbcPrinting {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    System.out.println("");
    int n=scanner.nextInt();
    int i=1;
    while(i<=n)
    {
        System.out.println("abc");
        i++;
    }
    
    scanner.close();
}
}

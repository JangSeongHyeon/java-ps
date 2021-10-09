import java.util.Scanner;

public class Q1046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String input=scanner.nextLine();
		String[] inputArray=input.split(" ");
		int a=Integer.parseInt(inputArray[0]);
		int b=Integer.parseInt(inputArray[1]);
		int c=Integer.parseInt(inputArray[2]);
		
		System.out.printf("%d%n",a+b+c);
		System.out.printf("%.1f%n",(a+b+c)/3.0);
	}

}

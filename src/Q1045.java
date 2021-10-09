import java.util.Scanner;

public class Q1045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String input=scanner.nextLine();
		String[] inputArray=input.split(" ");
		int a=Integer.parseInt(inputArray[0]);
		int b=Integer.parseInt(inputArray[1]);
		
		System.out.printf("%d%n",a+b);
		System.out.printf("%d%n",a-b);
		System.out.printf("%d%n",a*b);
		System.out.printf("%d%n",a/b);
		System.out.printf("%d%n",a%b);
		System.out.printf("%.2f%n",a/(float)b);
	}

}

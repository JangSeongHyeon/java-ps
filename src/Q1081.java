import java.util.Scanner;

public class Q1081 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String input=scanner.nextLine();
		String[] inputArray=input.split(" ");
		int a=Integer.parseInt(inputArray[0]);
		int b=Integer.parseInt(inputArray[1]);
		
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=b;j++) {
				System.out.printf("%d %d%n",i,j);
			}
		}
		

	}

}

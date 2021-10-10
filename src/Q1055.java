import java.util.Scanner;

public class Q1055 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String input=scanner.nextLine();
		String[] inputArray=input.split(" ");
		
		int a=Integer.parseInt(inputArray[0]);
		int b=Integer.parseInt(inputArray[1]);
		
		if(a==1 || b==1) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}

	}

}

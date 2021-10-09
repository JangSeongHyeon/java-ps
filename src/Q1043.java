import java.util.Scanner;

public class Q1043 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String input=scanner.nextLine();
		String[] inputs=input.split(" ");
		int a=Integer.parseInt(inputs[0]);
		int b=Integer.parseInt(inputs[1]);
		
		System.out.printf("%d",a%b);
	}

}

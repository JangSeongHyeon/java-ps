import java.util.Scanner;

public class Q1018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		String input=scanner.nextLine();
		String[] inputs=input.split(":");
		int h=Integer.parseInt(inputs[0]);
		int m=Integer.parseInt(inputs[1]);
		
		System.out.printf("%d:%d",h,m);

	}

}

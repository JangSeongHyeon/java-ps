import java.util.Scanner;

public class Q1019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		String input=scanner.nextLine();
		String[] inputs=input.split("\\.");

		int year=Integer.parseInt(inputs[0]);
		int month=Integer.parseInt(inputs[1]);
		int day=Integer.parseInt(inputs[2]);
	
		System.out.printf("%04d.%02d.%02d",year,month,day);

	}

}

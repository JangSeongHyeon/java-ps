import java.util.Scanner;

public class Q1014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		String input=scanner.nextLine();
		String[] inputs=input.split(" ");
		char x=inputs[0].charAt(0);
		char y=inputs[1].charAt(0);
		
		System.out.printf("%c %c",y,x);
	}

}

import java.util.Scanner;

public class Q1027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String input=scanner.nextLine();
		String[] inputs=input.split("\\.");
		System.out.printf("%02d-%02d-%04d",Integer.parseInt(inputs[2]),Integer.parseInt(inputs[1]),Integer.parseInt(inputs[0]));
	}

}

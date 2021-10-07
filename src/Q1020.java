import java.util.Scanner;

public class Q1020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String input=scanner.nextLine();
		String[] inputs=input.split("-");
		int x=Integer.parseInt(inputs[0]);
		int y=Integer.parseInt(inputs[1]);
		
		System.out.printf("%06d%07d",x,y);

	}

}

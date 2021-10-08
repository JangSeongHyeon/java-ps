import java.util.Scanner;

public class Q1025 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String input=scanner.nextLine();
		
		for(int i=0;i<5;i++) {
			System.out.println("["+(int)((input.charAt(i)-'0')*Math.pow(10, input.length()-i-1))+"]");
		}
		
	}

}

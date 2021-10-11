import java.util.Scanner;

public class Q1072 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int counter=scanner.nextInt();
		scanner.nextLine();
		String input=scanner.nextLine();
		String[] inputArray=input.split(" ");
		
		int i=0;
		while(i<inputArray.length) {
			System.out.println(inputArray[i]);
			i++;
		}
	}

}

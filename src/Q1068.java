import java.util.Scanner;

public class Q1068 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int input=scanner.nextInt();
		
		if(input>=90) {
			System.out.println("A");
		}else if(input>=70) {
			System.out.println("B");
		}else if(input>=40) {
			System.out.println("C");
		}else {
			System.out.println("D");
		}
	}

}

import java.util.Scanner;

public class Q1067 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		long input=scanner.nextInt();
		
		if(input>0) {
			System.out.println("plus");
		}else {
			System.out.println("minus");
		}
		
		if(input%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}

	}

}

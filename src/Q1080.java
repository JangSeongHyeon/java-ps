import java.util.Scanner;

public class Q1080 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int input=scanner.nextInt();
		int i=0;
		int sum=0;
		while(sum<input) {
			++i;
			sum+=i;
		}
		System.out.println(i);
		
	}

}

import java.util.Scanner;

public class Q1078 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int input=scanner.nextInt();
		int i=0;
		int sum=0;
		while(i<=input) {
			if(i%2==0) {
				sum+=i;
			}
			i++;
		}
		System.out.println(sum);

	}

}

import java.util.Scanner;

public class Q1083 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int input=scanner.nextInt();
		
		for(int i=1;i<=input;i++) {
			if(i%3==0) {
				System.out.printf("X ");
				continue;
			}
			System.out.printf("%d ",i);
		}
	}

}

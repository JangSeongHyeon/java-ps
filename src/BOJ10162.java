import java.util.Scanner;

public class BOJ10162 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int a,b,c,result;
		int input=scanner.nextInt();
		a=input/300;
		result=input%300;
		b=result/60;
		result=result%60;
		c=result/10;
		result=result%10;
		
		if(result==0) {
			System.out.printf("%d %d %d",a,b,c);
		}else {
			System.out.println(-1);
		}
		
	}

}

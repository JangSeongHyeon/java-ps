import java.util.Scanner;

public class BOJ2609 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String[] input=scanner.nextLine().split(" ");
		int A,B;
		int gcd;
		int multi;
		if(Integer.parseInt(input[0])>Integer.parseInt(input[1])) {
			A=Integer.parseInt(input[0]);
			B=Integer.parseInt(input[1]);
		}else {
			A=Integer.parseInt(input[1]);
			B=Integer.parseInt(input[0]);
		}
		
		multi=A*B;
		
		int tmp;
		while(true) {
			if(B==0) {
				gcd=A;
				break;
			}
			tmp=B;
			B=A%B;
			A=tmp;
			
		}
		
		
		
		System.out.println(gcd);
		System.out.println(multi/gcd);
	}

}

import java.util.Scanner;

//import java.util.Scanner;

public class Q1082 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String input=scanner.next();
		
		// String에서 16진수로 변경
		int b=Integer.valueOf(input,16);
		
		String s,ans;
		for(int i=1;i<16;i++) {
			s=Integer.toHexString(i).toUpperCase();	    // i를 16진수로 변경
			ans=Integer.toHexString(b*i).toUpperCase();	// 입력값xi 를 16진수로 변경
			System.out.println(input+"*"+s+"="+ans);
		}
		
		
	}
}


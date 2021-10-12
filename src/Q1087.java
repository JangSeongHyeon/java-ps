import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1087 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String input=br.readLine();
		int num=Integer.parseInt(input);
		
		int result=0;
		for(int i=0;i<=num;i++) {
			result+=i;
			if(result>=num) {
				System.out.println(result);
				break;
			}
		}
	}
}



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1089 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] input=br.readLine().split(" ");
		int a=Integer.parseInt(input[0]);
		int d=Integer.parseInt(input[1]);
		int n=Integer.parseInt(input[2]);
		
		int i=0;
		while(true) {
			a+=d;
			i++;
			if(i==n-1) {
				System.out.println(a);
				break;
			}
			
		}
	}

}

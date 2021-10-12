import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1094 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String input=br.readLine();
		int counter=Integer.parseInt(input);
		String[] input2=br.readLine().split(" ");
		
		for(int i=counter-1;i>=0;i--) {
			System.out.print(input2[i]+" ");
		}
	}

}

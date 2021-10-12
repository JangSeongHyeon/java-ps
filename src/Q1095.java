import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1095 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String input=br.readLine();
		int counter=Integer.parseInt(input);
		String[] input2=br.readLine().split(" ");
		int min=Integer.parseInt(input2[0]);
		for(String num:input2) {
			int number=Integer.parseInt(num);
			if(min>number) {
				min=number;
			}	
		}
		System.out.println(min);
	}

}

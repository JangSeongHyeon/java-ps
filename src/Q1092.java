import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1092 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] inputArray=br.readLine().split(" ");
		int a=Integer.parseInt(inputArray[0]);
		int b=Integer.parseInt(inputArray[1]);
		int c=Integer.parseInt(inputArray[2]);
		
		int day=1;
		while(day%a!=0 || day%b!=0 || day%c!=0) {
			day++;
		}
		
		System.out.println(day);
			
		
	}

}

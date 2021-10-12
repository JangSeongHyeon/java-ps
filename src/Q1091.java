import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1091 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] input=br.readLine().split(" ");
		long a=Integer.parseInt(input[0]);
		int m=Integer.parseInt(input[1]);
		int d=Integer.parseInt(input[2]);
		int n=Integer.parseInt(input[3]);
		
		
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		for ( int i=1; i<n;i++) {
			a = a * m + d;
		}
		bw.write(String.valueOf(a));
		bw.flush();
	}

}

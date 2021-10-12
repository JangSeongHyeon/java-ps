import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Q1085 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] inputArray=br.readLine().split(" ");
		long h=Long.parseLong(inputArray[0]);
		long b=Long.parseLong(inputArray[1]);
		long c=Long.parseLong(inputArray[2]);
		long s=Long.parseLong(inputArray[3]);
		
		if(h<=48000 && b<=32 && c<=5 && s<=6000) {
			double result=(h*b*c*s)/8.0/1024/1024;
			
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
			bw.write(String.format("%.1f", result)+" MB");
			bw.flush();
			bw.close();		
		}
	}

}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1086 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] inputArray=br.readLine().split(" ");
		long w=Long.parseLong(inputArray[0]);
		long h=Long.parseLong(inputArray[1]);
		long b=Long.parseLong(inputArray[2]);
		
		double result;
		if(1<=w && w<=1024 && 1<=h && h<=1024 && b%4==0 && b<=40) {
			result=w*h*b/8.0/1024/1024;
			
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
			bw.write(String.format("%.2f",result)+" MB");
			bw.flush();
			bw.close();
		}

	}

}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1084 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] inputArray=br.readLine().split(" ");
		int r=Integer.parseInt(inputArray[0]);
		int g=Integer.parseInt(inputArray[1]);
		int b=Integer.parseInt(inputArray[2]);
		
		
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int counter=0;
		for(int i=0;i<r;i++) {
			for(int j=0;j<g;j++) {
				for(int k=0;k<b;k++) {
					bw.write(i+" "+j+" "+k+"\n");
					counter++;
				}
			}
		}
		bw.write(String.valueOf(counter));
		bw.flush();
	}

}

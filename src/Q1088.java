import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1088 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String input=br.readLine();
		int num=Integer.parseInt(input);
		
		if(1<=num && num<=100) {
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
			for(int i=1;i<=num;i++) {
				if(i%3==0) {
					continue;
				}
				bw.write(String.valueOf(i+" "));
				bw.flush();
				
			}	
		}
	}

}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ2501 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 약수, k 입력
		String input=br.readLine();
		
		StringTokenizer st=new StringTokenizer(input," ");
		
		// 약수 & k 저장
		int n=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		
			// 결과값
			int result=0;
			
			int counter=0;
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					counter++;
					if(counter==k) {
						result=i;
						break;
					}
				}
			}
			
			

			if(counter>=k) {
				bw.write(String.valueOf(result));
			}else {
				bw.write(String.valueOf(0));
			}
			
			bw.flush();
			
			
			
			
		
		
		
		
	}

}

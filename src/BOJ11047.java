import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ11047 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input=br.readLine();
		StringTokenizer st=new StringTokenizer(input," ");
		// 동전 종류 & 가치의 합 input
		int n=Integer.parseInt(st.nextToken());		
		int k=Integer.parseInt(st.nextToken());
		int counter=0;
		
		
		// 동전 종류 개수의 크기에 맞는 배열 생성
		int[] array=new int[n];		
		
		// 배열의 각요소에 a(동전가치)를 input
		for(int i=0;i<array.length;i++) {
			array[i]=Integer.parseInt(br.readLine());
		}
		
		for(int i=n-1;i>=0;i--) {
			counter+=k/array[i];
			if(k%array[i]==0) {
				break;
			}
			k=k%array[i];
		}
		
		bw.write(String.valueOf(counter));
		bw.flush();
		bw.close();
		
	}

}

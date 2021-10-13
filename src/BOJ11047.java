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
		// ���� ���� & ��ġ�� �� input
		int n=Integer.parseInt(st.nextToken());		
		int k=Integer.parseInt(st.nextToken());
		int counter=0;
		
		
		// ���� ���� ������ ũ�⿡ �´� �迭 ����
		int[] array=new int[n];		
		
		// �迭�� ����ҿ� a(������ġ)�� input
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

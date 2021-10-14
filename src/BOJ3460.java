import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ3460 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String inputBinary="0";
		int input;
		int t=Integer.parseInt(br.readLine());
		
		//테스트 케이스 수에 해당하는 배열 생성
		String[] strArray=new String[t];
		
		// 테이트 케이스 수 만큼 input받음
		for(int i=0;i<t;i++) {
			input=Integer.parseInt(br.readLine());
			strArray[i]=Integer.toBinaryString(input);
			int length=strArray[i].length();
			
			for(int j=0;j<length;j++) {
				if(strArray[i].charAt(length-j-1)=='1') {
					System.out.print(j+" ");
				}
			}
			
			
		}		
	}

}



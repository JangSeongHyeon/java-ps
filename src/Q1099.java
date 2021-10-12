import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1099 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int[][] array=new int[10][10];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		// 맵(2차원배열) 입력받기
		for(int i=0;i<10;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			for(int j=0;j<10;j++) {
				array[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		int ix=1;
		int jy=1;
		//메인 코드
		Loop1:for(int i=ix;i<10;i++) {
			Loop2:for(int j=jy;j<10;j++) {
				
				if(array[i][j]==1) {
					jy=j-1;
					break Loop2;
				}else if(array[i][j]==2){
					array[i][j]=9;
					break Loop1;
				}else{
					array[i][j]=9;
				}
				
			}
		}
		
		
		// 결과 값 출력
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}

}

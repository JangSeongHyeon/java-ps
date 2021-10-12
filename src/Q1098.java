import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1098 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		// 가로(w)와 세로(h)값 입력	
		String[] sizeInput=br.readLine().split(" ");			
		int w=Integer.parseInt(sizeInput[0]);
		int h=Integer.parseInt(sizeInput[1]);
		
		
		// 격자 배열 만들기
		int[][] array=new int[w][h];
		
		
		
		// 막대 갯수 입력
		int stickNum=Integer.parseInt(br.readLine());		
		
		
		for(int i=0;i<stickNum;i++) {
			String[] detailInput=br.readLine().split(" ");
			int leng=Integer.parseInt(detailInput[0]);		// 길이
			int direc=Integer.parseInt(detailInput[1]);		// 방향
			int x=Integer.parseInt(detailInput[2])-1;		// x좌표
			int y=Integer.parseInt(detailInput[3])-1;		// y좌표
			
			if(direc==0) {
				for(int j=0;j<leng;j++) {
					array[x][y+j]=1;
				}
			}else {
				for(int j=0;j<leng;j++) {
					array[x+j][y]=1;
				}
			}
		}
		
		for(int i=0;i<w;i++) {
			for(int j=0;j<h;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1098 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		// ����(w)�� ����(h)�� �Է�	
		String[] sizeInput=br.readLine().split(" ");			
		int w=Integer.parseInt(sizeInput[0]);
		int h=Integer.parseInt(sizeInput[1]);
		
		
		// ���� �迭 �����
		int[][] array=new int[w][h];
		
		
		
		// ���� ���� �Է�
		int stickNum=Integer.parseInt(br.readLine());		
		
		
		for(int i=0;i<stickNum;i++) {
			String[] detailInput=br.readLine().split(" ");
			int leng=Integer.parseInt(detailInput[0]);		// ����
			int direc=Integer.parseInt(detailInput[1]);		// ����
			int x=Integer.parseInt(detailInput[2])-1;		// x��ǥ
			int y=Integer.parseInt(detailInput[3])-1;		// y��ǥ
			
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

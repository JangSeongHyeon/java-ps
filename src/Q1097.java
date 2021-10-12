import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1097 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int[][] array=new int[19][19];
		
		
		
		
		for(int i=0;i<array.length;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int[] inArr=array[i];
			for(int j=0;j<inArr.length;j++) {
				inArr[j]=Integer.parseInt(st.nextToken());
			}
		}
		
		
		int counter=Integer.parseInt(br.readLine());
		
		for(int i=0;i<counter;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int x=Integer.parseInt(st.nextToken())-1;
			int y=Integer.parseInt(st.nextToken())-1;
			
			for(int k=0;k<19;k++) {
				if(array[x][k]==0) {
					array[x][k]=1;				
				}else {
					array[x][k]=0;
				}
			}
			
			for(int k=0;k<19;k++) {
				if(array[k][y]==0) {
					array[k][y]=1;				
				}else {
					array[k][y]=0;
				}
			}
		}
		
		
		for(int i=0;i<array.length;i++) {
			int[] inArr=array[i];
			for(int j=0;j<inArr.length;j++) {
				System.out.print(inArr[j]+" ");
			}
			System.out.println();
		}
	}

}

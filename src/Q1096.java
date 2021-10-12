import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q1096 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int[][] array=new int[19][19];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String inputCounter=br.readLine();
		int	counter=Integer.parseInt(inputCounter);
				
		for(int i=0;i<counter;i++) {
			String[] input=br.readLine().split(" ");
			int a=Integer.parseInt(input[0]);
			int b=Integer.parseInt(input[1]);
			array[a-1][b-1]=1;
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

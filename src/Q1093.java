import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q1093 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int[] array=new int[23];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String input=br.readLine();
		int counter=Integer.parseInt(input);
		String[] input2=br.readLine().split(" ");
		
		
		for(String num:input2) {
			int a=Integer.parseInt(num);
				array[a-1]+=1;
		}

		for(int i:array) {
			System.out.print(i+" ");
		}
		
	}

}

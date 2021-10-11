import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1065 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String input=br.readLine();
		String[] inputArray=input.split(" ");
		int a=Integer.parseInt(inputArray[0]);
		int b=Integer.parseInt(inputArray[1]);
		int c=Integer.parseInt(inputArray[2]);
		
		int[] array= {a,b,c};
		int i=0;
		while(i<array.length) {
			if(array[i]%2==0) {
				System.out.println(array[i]);				
			}
			i++;
		}
		
		
	}

}

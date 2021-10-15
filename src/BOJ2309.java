import java.util.Scanner;
import java.util.Arrays;

public class BOJ2309 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] array=new int[9];
		int sum=0;
		
		for(int i=0;i<9;i++) {
			array[i]=sc.nextInt();
			sum+=array[i];
		}
		
		Loop1:for(int i=0;i<9;i++) {
			for(int j=i+1;j<9;j++) {
				if((sum-array[i]-array[j])==100) {
					array[i]=0;
					array[j]=0;
					break Loop1;
				}
			}
		}
		Arrays.sort(array);
		
		for(int i=0;i<9;i++) {
			if(array[i]!=0) {
				System.out.println(array[i]);
			}
			
		}
	}

}

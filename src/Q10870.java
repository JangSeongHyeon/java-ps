import java.util.Scanner;

public class Q10870 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int array[]=new int[n];
		
		if(n==0) {
			System.out.println(0);
			return;
		}else if(n==1) {
			System.out.println(1);
			return;
		}
		
		array[0]=0;
		array[1]=1;
		
	
		if(n>2) {
			for(int i=0;i<array.length-2;i++) { 	
				array[i+2]=array[i]+array[i+1];
			}
		}

		System.out.printf("%d",array[array.length-1]+array[array.length-2]);
		
		
	}

}

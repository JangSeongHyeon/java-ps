import java.util.Scanner;

public class BOJ2460 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int[][] array=new int[10][2];
		String[] input;
		int train=0;
		int result=0;
		
		for(int i=0;i<10;i++) {
			input=scanner.nextLine().split(" ");
			array[i][0]=Integer.parseInt(input[0]);
			array[i][1]=Integer.parseInt(input[1]);
			
			train-=array[i][0];
			train+=array[i][1];
			if(train>result) {
				result=train;
			}
		}
		System.out.println(result);
	}

}

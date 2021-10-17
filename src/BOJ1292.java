import java.util.Scanner;

public class BOJ1292 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String[] input=scanner.nextLine().split(" ");
		int start=Integer.parseInt(input[0])-1;
		int end=Integer.parseInt(input[1])-1;
		int[] array=new int[1000];

		
		int index=0;
		int i=1;
		Loop1:while(true) {
			for(int j=0;j<i;j++) {
				if(index>=1000) {
					break Loop1;
				}
				array[index]=i;
				index++;
			}
			i++;
		}
		
		int sum=0;
		for(int j=start;j<=end;j++) {
			sum+=array[j];
			
		}
		System.out.println(sum);
	}

}

import java.util.Scanner;

public class BOJ10818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		scanner.nextLine();
		String[] inputArray=scanner.nextLine().split(" ");
		
		int min=Integer.parseInt(inputArray[0]);
		int max=Integer.parseInt(inputArray[0]);
		
		
		for(int i=0;i<inputArray.length;i++) {
			int checkNum=Integer.parseInt(inputArray[i]);
			if(checkNum>max) {
				max=checkNum;
			}else if(checkNum<min) {
				min=checkNum;
			}
		}
		
		System.out.printf("%d %d",min,max);
		
		
	}
}

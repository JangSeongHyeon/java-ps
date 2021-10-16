import java.util.Scanner;

public class BOJ1978 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		scanner.nextLine();
		String[] array=scanner.nextLine().split(" ");
		
		
		int checker=0;
		int counter=array.length;
		
		for(int i=0;i<array.length;i++) {
			checker=Integer.parseInt(array[i]);
			if(checker==1) 
				counter-=1;
			for(int j=2;j<checker;j++) {
				if(checker%j==0) {
					counter-=1;
					break;
				}
			}
		}
		
		System.out.println(counter);
	}

}

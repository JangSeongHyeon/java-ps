import java.util.Scanner;

public class Q1066 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String input=scanner.nextLine();
		String[] inputArray=input.split(" ");
		int a=Integer.parseInt(inputArray[0]);
		int b=Integer.parseInt(inputArray[1]);
		int c=Integer.parseInt(inputArray[2]);
		
		int[] array= {a,b,c};
		int i=0;
		while(i<array.length) {
			if(array[i]%2==0) {
				System.out.println("even");				
			}else {
				System.out.println("odd");
			}
			i++;
		}

	}

}

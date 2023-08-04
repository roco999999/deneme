import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int counter = 0;
		int index = 0;
		
		int n = scan.nextInt();
		int[] c = new int[n];
		
		for(int i = 0; i < n;i++)
		{
			c[i] = scan.nextInt();
		}
		
		
		
		while(index != (n-1)) 
		{
			if(c[index + 2] == 0)
			{
				index += 2;
				counter++;
			}
			else if (c[index+1] == 0)
			{
				index += 1;
				counter++;
			}
			else
			{
				System.out.println("jump counter: "+counter + "\nbulundugu son bulut: " + (index+1) +"\nsona ulasamadik.");
				break;
			}
			
			if (index == (n-1)) {
				System.out.println(counter);
			}
		}
		
		
		
	}

}

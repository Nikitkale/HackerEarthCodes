package BasicIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fact {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		int j=Integer.parseInt(bf.readLine());
		if(j==0)
			System.out.println(1);
		else
		{
			int sum=1;
			for(int i=1;i<=j;i++)
			{
				sum*=i;
			}
			
			System.out.println(sum);
		}
		

	}

}

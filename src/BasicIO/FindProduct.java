package BasicIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindProduct {

	
	public static void main(String[] args) throws IOException {
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		int j=Integer.parseInt(bf.readLine());
		String nos[]=bf.readLine().split(" ");
		long sum=1;
		for(int i=0;i<j;i++)
		{
			
			sum=(sum*Integer.parseInt(nos[i]))%1000000007;
		}
		
		System.out.println(sum);
		
	}

}

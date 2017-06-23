package BasicIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNo {

	
	public static boolean seePrime(int num, int i)
	{
		 if (i == 1)
		    {
		        return true;
		    }
		    else
		    {
		       if (num % i == 0)
		       {
		         return false;
		       }
		       else
		       {
		         return seePrime(num, i - 1);
		       }       
		    }
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		int j=Integer.parseInt(bf.readLine());
		
		for(int i=2;i<j;i++)
		{
			if(seePrime(i,i/2))
			{
				System.out.println(i);
			}
		}

	}

}

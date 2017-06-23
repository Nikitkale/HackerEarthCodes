package BasicIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrailingZeros {

	public static int findTrailingZeros(int  n)
	{
	    int count = 0;
	 
	    for (int i=5; n/i>=1; i *= 5)
	          count += n/i;
	 
	    return count;
	}
	
	public static int binary(int i,int low, int high)
	{
			if(low==high+1)
				return -1;
			int mid=(low+high)/2;
			if(findTrailingZeros(mid)==i && findTrailingZeros(mid-1)==i-1 )
			{
				return mid;
			}
			else
			{
				if(findTrailingZeros(mid)>=i)
				{
					return binary(i,low,mid);
				}
				else
				{
					return binary(i,mid,high);
				}
				/*else {
					return binary(i,low,high);
				}*/
			}
			
			
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		/*BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int j=Integer.parseInt(bf.readLine());
		for(int k=0;k<j;k++)
		{
					
					int z=Integer.parseInt(bf.readLine());
					
					
					int n=binary(z, 0, 100000);
					
					if(n==-1)
						System.out.println(0);
					else
						System.out.println(5);
					for(int i=0;i<5;i++)
					{
						System.out.print(n+i+" ");
					}
		}*/
	
		for(int i=0;i<1000;i++)
		{
			System.out.println(findTrailingZeros(i));
		}
	}

}

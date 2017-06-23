package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Min_Max {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		int len=Integer.parseInt(bf.readLine());
		
		int input[]=new int[len];
		String in[]=bf.readLine().split(" ");
		for(int i=0;i<len;i++)
		{
			input[i]=Integer.parseInt(in[i]);
		}
		Arrays.sort(input);
		boolean flag=false;
		for(int a:input)
		{
		System.out.println(a);
		}
		for(int i=0;i<len-1;i++)
		{
			
			if(input[i+1]==input[i] || input[i+1]==input[i]+1)
			{
				continue;
			}
			else
			{
				flag=true;
			}
		}
		
		if(flag==true)
			System.out.println("No");
		else
			System.out.println("YES");
	}

}

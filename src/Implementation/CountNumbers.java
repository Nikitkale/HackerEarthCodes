package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountNumbers {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int cases=Integer.parseInt(bf.readLine());
		
		for(int i=0;i<cases;i++)
		{
			bf.readLine();
			String input=bf.readLine();
			int counter=0;
			
			for(int j=0;j<input.length();j++)
			{
				if(input.charAt(j)>=48 && input.charAt(j)<=57 && ((j+1)==input.length() || input.charAt(j+1)<48 || input.charAt(j+1)>57))
				{
					counter++;
				}
			}
			
			System.out.println(counter);
		}
		
		
		
	}

}

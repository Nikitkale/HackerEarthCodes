package BasicIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RoyProfile {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		int j=Integer.parseInt(bf.readLine());
		int cases=Integer.parseInt(bf.readLine());
		
		for(int i=0;i<cases;i++)
		{
			String nos[]=bf.readLine().split(" "); 
			
			int m=Integer.parseInt(nos[0]);
			 int n=Integer.parseInt(nos[1]);
			
			 if(m< j || n < j)
			 {
				 System.out.println("UPLOAD ANOTHER");
			 }
			 else
			 {
				 if(m==n)
				 {
					 System.out.println("ACCEPTED");
				 }
				 else
				 {
					 System.out.println("CROP IT");
				 }
			 }
			
		}
		
	}

}

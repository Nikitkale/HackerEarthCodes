package BasicIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountDivisor {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		String nos[]=bf.readLine().split(" "); 
		
		int j=Integer.parseInt(nos[0]);
		 int k=Integer.parseInt(nos[1]);
		 int l=Integer.parseInt(nos[2]);
		 int counter=0;
		 while(j<=k)
		 {
			 if(j%l==0)
				 {
				counter ++;
				 }
			 j++;
		 }
		
		 System.out.println(counter);
	}

}

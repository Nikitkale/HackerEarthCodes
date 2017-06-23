package BasicIO;

import java.io.*;
public class Stopat42 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		int j;
		while((j=Integer.parseInt(bf.readLine()))!=42)
		{
			System.out.println(j);
		}
	}

}

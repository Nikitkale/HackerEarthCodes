import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompleteString {


	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int cases=Integer.parseInt(bf.readLine());
		int arr[];
		
		for(int i=0;i<cases;i++)
		{
			String input=bf.readLine();
			arr=new int[26];
			for(int j=0;j<input.length();j++)
			{
				if(arr[input.charAt(j)-97]==0)
				{
					arr[input.charAt(j)-97]=1;
				}
			}
			
			boolean flag=false;
			
			for(int a:arr)
			{
				if(a==0)
				{
					flag=true;
					break;
				}
			}
			if(flag==true)
			{
				System.out.println("NO");
			}
			else
				System.out.println("YES");
			
			
		}
		
		
		

	}

}

import java.io.*;
class A
{
	public static void main(String ar[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
	
		StringBuilder bride = new StringBuilder(br.readLine().trim());
		StringBuilder groom = new StringBuilder(br.readLine().trim());
		
		int num = getReminingBride(bride,groom,n);
		System.out.println(num);
		
		
	}
	public static int getReminingBride(StringBuilder b,StringBuilder g,int n)
	{
		int i=0,j=0, count =0;
		for(i=0,j=0;i<n;)
		{
			if(j>g.length())
				j = j%g.length();
			int index = i;
			if(b.charAt(i) == g.charAt(j))
			{
				g.deleteCharAt(j);
				i++;
				count = 0;
				
				
			}
			else if(count == g.length())
			{
				break;
			}
			else
			{
				char c = g.charAt(j);
				
				g.deleteCharAt(j);
				g.insert(g.length(),c);
				j = 0;
				count++;
			}
		}
		return g.length();
		
	}
}

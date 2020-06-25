import java.io.*;
class A
{
	public static void main(String ar[]) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine().trim());
		
		while(test-->0){
			
			int n = Integer.parseInt(br.readLine().trim());
			int k =0;
			int skip = 0;
			int index =0;
			for(int i=n;i>0;i--)
			{
				for(int j =1;j<=n*2;j++)
				{
					if(j<=k)
					{
							System.out.print("*");
					}
					else if(j%2==0)System.out.print("0");
					else
					{
						
							System.out.print(++index);
					}
				}
					int range = n*n +1 -skip;
					
					for(int p =1;p<2*n;p++)
					{
						if(p<2*i){
							if(p%2 == 0)System.out.print("0");
							else
							{
								skip++;//3
								System.out.print(range++);
							}
							
						}
						else
						{
							System.out.print(" ");
						}
					}
					skip = skip -1;
					k = k+2;
				System.out.println();
			}
		}
	}
}
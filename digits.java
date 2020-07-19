import java.io.*;
class A
{
	public static void main(String ar[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());

		int arr[] = new int[n];
		String s[] = br.readLine().split(" ");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i] =Integer.parseInt(s[i]);
		}
		
		System.out.println(getPairsCount(arr,n));
		
	}
	public static int getPairsCount(int arr[],int n)
	{
		int count =0;
		for(int i=0;i<n;i++)
		{
			arr[i] = getBitCount(arr[i]);
		}
		int counteven[] = new int[10];
		int countodd[] = new int[10];
		for(int i=0;i<n;i++)
		{
			if(i%2 == 0)
			{
				countodd[arr[i]/10]++;
			}
			else
			{
				counteven[arr[i]/10]++;
			}
		}
		
		for(int i=0;i<10;i++)
		{
			if(counteven[i] == 2)
			{
				count++;
			}
			else if(counteven[i] == 3)
			{
				count = count+2;
			}
		}
		for(int i=0;i<10;i++)
		{
			if(countodd[i] == 2)
			{
				count++;
			}
			else if(countodd[i] == 3)
			{
				count = count+2;
			}
		}
		
		return count;
		
		
	}
	public static int getBitCount(int n)
	{
		int a = n%10;
		int b = (n/10)%10;
		int c = n/100;
		
		int max = Math.max(Math.max(a,b),c);
		int min = Math.min(Math.min(a,b),c);

		int count = (max * 11) + (min * 7);
		
		if(count>99)
		{
			return count%100;
		}
		else
		return count;
		
	}
}
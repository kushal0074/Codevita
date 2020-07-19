class A
{
	public static void main(String a[])
	{
		int arr[] = {10,2,12,30,10};
		int n = arr.length;
		int maxDiff  = maxDiffrence(arr,n);
		
		System.out.println(maxDiff);
	}
	public static int maxDiffrence(int arr[],int n)
	{
		int min = arr[0];
		int max = arr[0];
		
		for(int i=1;i<n;i++)
		{
			if(min > arr[i])min = arr[i];
			if(max < arr[i])max = arr[i];
		}
		return max - min;
	}
}
class A
{
	public static void main(String ar[])
	{
		int arr[] = {1,5,3,8,12};
		System.out.println(stockBuyAndSell(arr,0,arr.length - 1));
	}
	public static int stockBuyAndSell(int arr[],int start,int end)
	{
		if(start>=end) return 0;
		
			int profit = 0;
			for(int i =start;i<end;i++)
			{
				for(int j = i+1;j<=end;j++)
				{
					if(arr[i] < arr[j])
					{	
						int new_profit = arr[j] - arr[i] + stockBuyAndSell(arr,start,i-1)
											+ stockBuyAndSell(arr,j+1,end);
						profit = Math.max(new_profit,profit);
					}
				}
			}
			return profit;
		
	}
}